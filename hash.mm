//
//  hash.mm
//
//  Created by Dalibor Filus on 2011-12-10.
//  Copyright (c) 2011 __MyCompanyName__. All rights reserved.
//

#import "hash.h"

int main() {
    NSLog(@"Allocating...\n");
    NSAutoreleasePool * pool = [[NSAutoreleasePool alloc] init];
    NSMutableDictionary * h = [[NSMutableDictionary alloc] initWithCapacity:10000000];

    int i = 0;
    NSLog(@"Running...\n");
    while(i < 10000000) {
        //[h setObject:@"aaa" forKey:[[NSNumber numberWithInt:i] stringValue]];
        [h setObject:@"aaa" forKey:[NSNumber numberWithInt:i]];
        i += 1;
    }
    
    NSLog(@"Draining pool...\n");
    [pool drain];
    NSLog(@"done.\n");
    return 0;
}

//  NSString stringWithFormat:@"%d", i: 45s
// NSNumber numberWithInt:i stringValue: 55s
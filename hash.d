import std.stdio;
import std.string;

void main(string[] args)
{
    int i = 0;
    string[int] h;
    while(i < 10000000)
    {
        h[i] = format("aaa%d", i);
        if(i < 100)
        {
            writefln("aaa%d", i);
        }
        i++;
    }
}

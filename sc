In the Learn IDE, click on the
**terminal** window and type `httpserver`. Hit enter.

The `httpserver` program will start up. When you want to quit `httpserver` press
`Control + c` to end the program. If you want to try it out now, go ahead. Just
remember to start `httpserver` back up again!

You'll be given a web site address.

For example:

![Starting the webserver](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/launched_web_server.png)

This output says:

`Your server is running at 67.205.152.27:59976`

Open up another browser tab, paste that web site address and add
`/my_list.txt`. So I'll be visiting `http://67.205.152.27:59976/my_list.txt`.

We see:

![Plaintext list rendered by the browser](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/plaintext_list_browser_rendered.png)

Essentially we see the same plain-text in the browser as the same plain-text
file that we wrote. The browser doesn't really know that it's got a list and it
doesn't know that it's got songs either. Still, our problem remains that we
_humans_ know what a list looks like thanks to _culture_; aliens, individuals
from remote island tribes who haven't been calibrated to that culture _cannot
find the meaning of the structure_. The same is true of **computers**.

Let's enrich our file to contain not only this **content** but also to contain
information about _meaning_ as well as information about _presentation_ in this
document. We can do this by adding additional information called **markup** to
the document.

> An HTML "file" or "document" is a plaintext file which contains **content** as
> well as **markup** information.



The **markup** text provides information about the _meaning_ of a plaintext line
("it's a list item", "it's a header"). Some HTML authors use the Greek word for
"meaning" and call that "semantic markup." You can use that too, if you like.

The **markup** provides guidance on how to display certain bits of content
("Paragraphs should have 15 pixels between them," "The header should use a font
size that's 3-times the standard system font-size"). That markup is called
_presentational_ markup because it's about the typographic / graphic
_presentation_ of the content.

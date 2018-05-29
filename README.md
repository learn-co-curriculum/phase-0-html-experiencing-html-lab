# Experiencing HTML Lab


## Problem Statement

How do we go about writing text that is designed for viewing on the web? How
does that differ from the text that we might write into a plain text file?
We're going to explore how these things differ in this lab. We're also going to
dabble with one of the most important philosophical questions ever asked by
humans: _How do arrangements of symbols gain meaning_. So we're going to dabble
with the bases of human experience and learn to write HTML! Not bad for a
lesson!

With such lofty heights in our sights, this lab is a bit long. Don't lose
heart, this lab is here to help you get the big picture. If you find you're
confused, ask for help or talk to a friend.

## Objectives

1. Discern between text that is designated as _markup_ versus _content_
2. Recognize the difference between source text and text as viewed in a browser
3. Use HTML tags, without prior experience, to change the display of _content_
   by providing _markup_
4. Discover common idioms and terms used by HTML producers

## Discern Between Text That Is Designated As _markup_ Versus _content_

Launch LearnIDE (use the open IDE button) and create a new file called
`my_list`.txt. Your file extension suggests that the content will be (plain-)
text.

Think of a collection of things united by theme: Pok&eacute;mon, Old-school
MC's, Prime Ministers of New Zealand, Magical Beasts and Where to Find Them,
etc.

Now write in a few entries in your file. Here's one from us (highly-influenced
by English post-punk music).

```text
Love Will Tear Us Apart
Bela Lugosi's Dead
A Forest
Nine While Nine
Girlfriend In a Coma
```

We would call this the _content_ of the file. It's the thing we're trying to
communicate.

### Content versus Representation

Let's investigate the nature of _content_ more deeply and ask: "What does this
_content_ represent?" That is, what is the author's intention with this
content? The author, and most readers, know that the _intention_ of this
_content_ is to communicate a list of things. But what _in this content itself_
communicates that this represents a list? The answer might surprise you.

Nothing. Nothing in the _content_ itself communicates what the _content_
signifies.

In order to translate a few words, a few more words on a new line, a few
words on a new line, etc. into a "list" it requires that you have in your mind
the _cultural precept_ known as a "list." You infer list-ness when you see
words stacked together vertically with very little horizontal content.

Similarly if you have a certain _cultural precept_ and familiarity with English
post-punk / Goth music you _might_ recognize that the list items constitute
songs by Joy Division, Bauhaus, The Cure, The Sisters of Mercy, and the Smiths,
respectively. Nevertheless, it's your _cultural_ knowledge, or lack thereof,
that makes this "a list of songs" or a list of "very strange word soup items."

The essential fact is that there is nothing in this content itself that
represents what the content is that exists independently of your cultural
precepts or lack thereof.

Whoa.

We might suppose that we could more clearly communicate that the lines refer to
names of songs by wrapping each line in quotation (`"`) marks like so:

```text
"Love Will Tear Us Apart"
"Bela Lugosi's Dead"
"A Forest"
"Nine While Nine"
"Girlfriend In a Coma"
```
Amazingly this is _another_ cultural precept ("punctuation") which appeals to
another precept ("entitling of works of art").

This leads to a challenging question: How can we share information about what
arrangements of text means with a computer &mdash; a thing that has _absolutely
no possible culture to help it infer our intentions_?

### Denoting Lists

Try updating your `my_list.txt` file in some way that suggests, a bit more
clearly that you're working with a list. Discuss it with a friend, if you have
one handy. Talk about how your _culture_ is helping you see the list-ness or
book-title-ness.

### List Representations

Some might have made their content a list by making it look like:

```text
* "Love Will Tear Us Apart"
* "Bela Lugosi's Dead"
* "A Forest"
* "Nine While Nine"
* "Girlfriend In a Coma"
```

...or maybe...

```text
1. "Love Will Tear Us Apart"
2. "Bela Lugosi's Dead"
3. "A Forest"
4. "Nine While Nine"
5. "Girlfriend In a Coma"
```
...or maybe...

```text
A. "Love Will Tear Us Apart"
B. "Bela Lugosi's Dead"
C. "A Forest"
D. "Nine While Nine"
E. "Girlfriend In a Coma"
```

...or maybe for someone marking completion through a list...

```text
[ ] "Love Will Tear Us Apart"
[X] "Bela Lugosi's Dead"
[ ] "A Forest"
[ ] "Nine While Nine"
[ ] "Girlfriend In a Coma"
```

Yet again, there's nothing in the content itself that communicates what it
represents. To experience this pain keenly, let's try asking a computer what it
thinks. In LearnIDE, click on the **Terminal** window and type `httpserver`.
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

Let's augment our list by transforming it an `.html` file where we can add
**markup** directives on how to _present_ our content and describe the
_meaning_ of some of the content elements.

## Plaintext to HTML

1. Create a new file called `my_list.html`
2. Copy the contents of `my_list.txt` and paste them into `my_list.html`
3. Update your browser to view `my_list.html`

![Plaintext file as HTML](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/plaintext_list_as_html.png)

Here we see what a browser, ignorant of our _culture_ makes of our plaintext
file. It doesn't know how to find _meaning_ or how to interpret the _semantic_
purpose of our `my_list.html` file. Let's help it.

## Adding HTML

This lab will provide you what to type. Subsequent labs will deeply examine
details of HTML markup. However, our goal here is to show how slight changes to
markup can dramatically alter the browser's presentation of content. If you're
fuzzy on a detail that's fine. Make a note of a question, but don't get scared.
Nothing's going to break and you might learn something amazing.

### Denoting List Items

1. Determine what "class" of thing each list item is. Is it a `grocery` or a
   `dairy-item`, a `president`, or `ruminant-quadruped`? We'll call this the
   _class name_.
2. Wrap each line with `<li class="class name">` and `</li>`. For example: `<li
   class="class name">"A Forest"</li>`

![Plaintext file as HTML](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/marking_up_song_list_items.png)

Flip back to your browser tab and refresh (make sure your `httpserver` program
is still running!). You should see something like the following:

![Songlist](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/ul_song_list.png)

Suddenly the browser has learned a bit about our _culture_! When we say `<li>`,
we're saying, "Browser, this is a **list item** make this look like your
understanding of lists!"

While your HTML file _has not changed_ its _interpretation_ by the browser, the
intermingling of _content_ with _markup_ produces something richer than mere
plaintext display.

We've _also_ provided a hint to the browser that each of these list items
documents a thing. We specify the thing by adding an _attribute_ called `class`
and specifying that a given list item's `class` is "song."

Despite knowing that all our list items are items of the `song` "class," the
browser doesn't do anything special with that knowledge (yet). This is a
hallmark of how browsers behave: if they can't find anything special to do,
they try to provide a pretty-decent experience.

### Denoting Ordered Lists

Something that our _culture_ tells us is that "list items belong to a collective."
Seeing "milk, eggs, cheese" suggests "Grocery List" or "John, Paul, George, and
Ringo" suggests "Beatles Members." Let's tell browsers that our list items all
fit together as an "ordered list" &mdash; a list with each list item being
marked by a sequentially increasing number.

Wrap the entire set of `<li>` items with an `<ol>` and `</ol>` like so:

![List displayed as ordered list unindented]( https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/wrapping_song_li_in_ol.png)


Which displays:

![List displayed as ordered list](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/ordered_list.png)

### Wrapping and Indentation

You might have noticed a pattern, HTML is the successive _wrapping_ of
_content_ in HTML "tags" which constitue the _markup_ of the document.

You've also just seen that tags can "nest". In our case, the `<li>` tagged
materials, or "elements," are nested within the `<ol>` "element." To make
things more readable, we indent contained tags in their container. In this
case, most HTML authors would expect our code to look like this:

![List with ordered list indented](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/wrapped_ol_songlist.png)

Adjust your document as appropriate. When you view this indented text in the
browser, _you should see no change_. While indentation and separated lines
("whitespace") have meaning in the _culture_ of humans, they don't have any
such significance in HTML.

In fact, because of browsers' indifference to whitespace, it's _possible_ **but
certainly against all custom of HTML authors** to write this same HTML file as:

![Whitespace innocence](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/whitespace_insensitivity.png)

While this certainly _works_, it breaks the standards HTML authors expect.

### Ordered to Unordered

Let's change our ordered list to be unordered. We might not care that the items
are in order (songs) but might care very much if the order was important (a
recipe, say). If `<ol>` means **o**rdered **l**ist, `<ul>` means **u**nordered
**l**ist...

![Back to Unordered List](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/unordered_list.png)

Here we return to a "bulleted" unordered list. This is the same as when we
first started and had no `<ul>` tags. Recall, browsers often guess what you
meant when they notice something missing. In this case, most browsers, if they
see an empty `<li>` outside of a `<ul>` or an `<ol>` will add one.

### Add a Description Paragraph

Let's introduce our list by adding some introductory content:

```html
Some of my favorite post-punk and Goth songs!
<ul>
  <li class="song">"Love Will Tear Us Apart"</li>
  <li class="song">"Bela Lugosi's Dead"</li>
  <li class="song">"A Forest"</li>
  <li class="song">"Nine While Nine"</li>
  <li class="song">"Girlfriend In a Coma"</li>
</ul>
```

Flip back to the browser and see what the result is. What the browser displays
is often called "the rendered page" because it's an interpretation (or
browser's "rendering") of the source material (the HTML). So, looking at "the
rendered page," we see that the browser did something pretty sensible, it
guessed that we meant to have this content in a separate paragraph. Let's be
explicit and wrap the paragraph in the `<p>` tag set. Much like `class`, let's
add an `id` "attribute" that helps tell what the `<p>` is about.

```html
<p id="description">Some of my favorite post-punk and Goth songs!</p>
<ul>
  <li class="song">"Love Will Tear Us Apart"</li>
  <li class="song">"Bela Lugosi's Dead"</li>
  <li class="song">"A Forest"</li>
  <li class="song">"Nine While Nine"</li>
  <li class="song">"Girlfriend In a Coma"</li>
</ul>
```

While we might have multiple instances of a class member (many `songs`) there's
only one `description` paragraph. Take a look at your "rendered page" and make
sure it makes sense.

### Put a Header on It

Lastly, let's put a "heading" or a "title" on the top of our document. Add a
title and "wrap" it with an `<h1> .... </h1>` tag. Here's our example again:

`<h1>My Music List</h1>`

### Ta-Dah!

Admire your finished work!

Here's the full code:


```html
<h1>My Music List</h1>
<p id="description">Some of my favorite post-punk and Goth songs!</p>
<ul>
  <li class="song">"Love Will Tear Us Apart"</li>
  <li class="song">"Bela Lugosi's Dead"</li>
  <li class="song">"A Forest"</li>
  <li class="song">"Nine While Nine"</li>
  <li class="song">"Girlfriend In a Coma"</li>
</ul>
```

![Final Document](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/final_header_paragraph_ul.png)

### Epilogue

This is, essentially, the work of learning to write HTML. You will grow more
familiar with tags, what they do, and how they display in a browser. You will
then "mark your content up" so that browsers know how to present your content
properly. Eventually you will use information like `class` and `id` to add
specific style and presentation behavior to items of the class type or bearing
the unique `id`entifier.

Every web page: Netflix, Facebook, Twitter, Google, The NRC Handelsblad, Le
Monde &mdash; _every single one uses the standard that **you** just worked with
to inform and change lives every day_. Welcome to the club!

When you're done, click on the **Terminal** of LearnIDE, and type `learn`
and verify that your tests pass. Make sure that you have your HTML 
content in a file called `my_list.html` in order to pass the check.

Then run the command `learn submit`. This will log your progress to our
systems. If everything's gone well, you'll be ready to move on to the
next lesson!

## Conclusion

In this lesson we saw that by editing a plain text file and augmenting
plaintext content with special "markup" characters we create provide HTML
documents.

HTML reading programs ("browsers") interpret the source HTML file and create a
"rendered" version of the page.

In subsequent lessons we will learn additional tags which provide us an
ever-richer ability to describe how to present our content.  We might be
starting with paragraphs today, but soon we'll be including video, creating
multi-column layouts, and ensuring our sites work equally well on a web-enabled
refrigerator as well as smartphone.

# Experiencing HTML Lab

## Learning Goals

- Create an ordered HTML list
- Create an unordered HTML list

## Introduction

How do we go about writing text for the web? How is that different from the
text that we write in a text file?  We're going to experience for ourselves how
these things are different in this lab.

You don't need any prior knowledge of HTML for this lab. We're going to tell
you what to type. Don't focus on specific commands or taking notes. Everything
will be covered thoroughly later. Instead, the goal of this exercise is to feel
the joy of editing a file and seeing the change "out there."

**NOTE:** We don't expect you to know _markup_, _content_, _source text_, or
_rendered text_ yet. We'll be defining them in this lab.

## Create an Unordered HTML List

Think of a collection of things united by theme: Pok&eacute;mon, Old-school
MC's, Prime Ministers of New Zealand, Magical Beasts and Where to Find Them,
etc. We're going to walk through how to create a list of these things marked up
with HTML.

### Create a Text File with Content

Launch the Learn IDE (use the Open IDE button) and create a new file called
`my_list.txt`. The file extension suggests to humans and operating systems
that it contains text.

Remember your collection of things? Now write in a few of them in your file.
Here's an example from us (songs in the English post-punk genre).

```text
"Love Will Tear Us Apart"
"Bela Lugosi's Dead"
"A Forest"
"Nine While Nine"
"Girlfriend In a Coma"
```

The material we typed into the file is called the _content_. It's the thing
we're trying to communicate.

### Content as a List in a Text File

A problem with our _content_ is that it doesn't explicitly state anywhere that
it's a list. In the example, we see a list of songs. But a browser doesn't know
what a "list" is. 

We need to help browser **know**  what a list is. The secret is to add "notes"
or "breadcrumbs" to the content that tell the browser that it has list items
and that these items "go together" in a list. To add these "notes" we surround
the _content_ with bits of _markup_, with bits of HTML. 

We will take the text content from our text file, paste it into a new HTML file
and then we will add _markup_ so that a browser "sees" a list. Let's write an
HTML file!

### Text Inside an HTML File

Now we're going to create an HTML list together.

1. Create a new file called `my_list.html`
2. Copy the contents of `my_list.txt` and paste them into `my_list.html`
3. Save the `my_list.html` file
4. In the Learn IDE, click on the **terminal** window and type `httpserver`.
5. Hit enter to run the command

The `httpserver` program will start up. This is a program that publishes your
HTML files on the internet. When you want to quit `httpserver`, press `Control + c`
to end the program. If you want to try it out now, go ahead. Just remember
to start `httpserver` back up again!

When `httpserver` starts, you'll be given a web site address.

![Starting the web server](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/launched_web_server.png)

`httpserver` says:

`Your server is running at 67.205.152.27:59976`

> **ASIDE**: For our example, our server is running at 67.205.152.27:59976 but keep in mind that yours could be different.

Open up another browser tab, paste that web site address and add the file I wish
to view after a `/`. We want to view `my_list.html`, so in my example, I'll be
visiting `http://67.205.152.27:59976/my_list.html`. **We will call this tab "the
viewing tab."**

We see:

![HTML file with non-marked-up content displays on one line](https://curriculum-content.s3.amazonaws.com/web-development/intro-the-shell/non_marked_up_list.png)

As noted above, the browser doesn't know that items on new lines means "items
in a list." Browsers ignore when HTML has is split onto new lines. We cover why
a little later in this README. Since the browser doesn't know we intend this to
be a list **and** since browsers ignore when _content_ is split onto different
lines, it displays all the _content_ on one line. Not what we wanted.

### A Text Not-Really-A-List Into a Real-HTML-List

> **REMEMBER**: This lab will provide you what to type. Subsequent labs will
> deeply examine details of HTML markup. However, our goal here is to show how
> slight changes to markup can quickly alter the browser's display of content.
> If you're fuzzy on a detail that's fine.

#### Marking-Up List Items

OK, we've reached the critical moment. We're going to tell the browser that
these bits of letters represent **list items**. To do so we "wrap" each line
with `<li>` and `</li>`. For example: `<li>"A Forest"</li>`

```html
<li>"Love Will Tear Us Apart"</li>
<li>"Bela Lugosi's Dead"</li>
<li>"A Forest"</li>
<li>"Nine While Nine"</li>
<li>"Girlfriend In a Coma"</li>
```

Flip back to the **viewing tab** and refresh (make sure your `httpserver` program
is still running!). You should see something like the following:

![Songlist](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/ul_song_list.png)

**AWESOME**.

In this step we added some HTML _markup_:

* The `<li>` is an HTML **list item** _opening tag_
* The `</li>` is an HTML _closing tag_
* We would call this pair of opening and closing tags a "`li` tag"
* The whole length of text of _opening markup_ plus "wrapped" content plus
  _closing markup_ (`<li>...content...</li>`) is called "an HTML element;" or,
  more exactly, an `li element`

Again, you don't need to memorize these terms yet, but we want to help you
develop an intuition for how these words are used. You will be using these
terms when speaking with other developers and HTML authors.

It may not seem like we did much work, but the idea of a method for "marking up"
_content_ and linking it is the foundation of the web. It's what made Tim
Berners-Lee's reputation. And **you** just experienced Sir Tim's great insight.
**AWESOME**.

Let's work with additional HTML tags to see how we tweak our HTML a bit more.
Let's tell the browser "Hey! These list items, they go together!"

### Indicating that List Items Are Connected

Wrap the entire set of `<li>` items with an `<ol>` and `</ol>` like so:

```html
<ol>
<li>"Love Will Tear Us Apart"</li>
<li>"Bela Lugosi's Dead"</li>
<li>"A Forest"</li>
<li>"Nine While Nine"</li>
<li>"Girlfriend In a Coma"</li>
</ol>
```

Save the file and refresh the **viewing tab**. It should display:

![List displayed as an ordered list](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/ordered_list.png)

We told the browser that this set of list items that we "wrapped" in the
**ordered list** tag go together **as a list**. Because we told the browser
that the list is **ordered** it decided to be helpful and put numbers next to
the list items _for us_.

### Wrapping and Indentation

With all these angle-brackets of _markup_ and _content_ mixed together, HTML
authors like to use indentation to make HTML easier to read. Here's how most
HTML authors would expect our code from the previous section to be arranged:

```html
<ol>
  <li>"Love Will Tear Us Apart"</li>
  <li>"Bela Lugosi's Dead"</li>
  <li>"A Forest"</li>
  <li>"Nine While Nine"</li>
  <li>"Girlfriend In a Coma"</li>
</ol>
```

Update your document. Save it and refresh your **viewing tab**.

Remember earlier when noticed browsers ignored _content_ when it was on
separate lines? Cleaning up your code requires splitting lines, adding spaces,
and adding tabs. Browsers ignore those characters that _humans_ use to make
their HTML reader-friendly.

## Create an Unordered HTML List

Let's change our ordered list to be **unordered**. If `<ol>` means **ordered
list**, you might guess that `<ul>` means **unordered list**. Make the change
and refresh your **viewing tab**.

![Back to Unordered List](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/unordered_list.png)

Here we return to a "bulleted" unordered list.

> **ASIDE**: If you've been following along closely, you  might be wondering, if
> we didn't have a `<ul>` tag around our `<li>` items earlier, how did the
> browser know how treat those `<li>` as if they were in a `<ul>`? When browsers
> detect problematic HTML they guess! This can lead to some very strange results
> when you make an error, but if you write _invalid_ HTML, they try to recover.
> HTML validity will be discussed further soon!

### Add a Description Paragraph

Let's introduce our list by adding some background:

```html
<p>Some of my favorite post-punk and Goth songs!</p>
<ul>
  <li>"Love Will Tear Us Apart"</li>
  <li>"Bela Lugosi's Dead"</li>
  <li>"A Forest"</li>
  <li>"Nine While Nine"</li>
  <li>"Girlfriend In a Coma"</li>
</ul>
```

Take a look at your "rendered page" and verify the result is to your liking.

### Put a Header on It

Lastly, let's put a "heading" on the top of our document. Add a `h1` element
with an appropriate title inside.

`<h1>My Music List</h1>`

Here's the full example code:

```html
<h1>My Music List</h1>
<p>Some of my favorite post-punk and Goth songs!</p>
<ul>
  <li>"Love Will Tear Us Apart"</li>
  <li>"Bela Lugosi's Dead"</li>
  <li>"A Forest"</li>
  <li>"Nine While Nine"</li>
  <li>"Girlfriend In a Coma"</li>
</ul>
```

![Final Document](https://curriculum-content.s3.amazonaws.com/web-development/experiencing-html-lab/final_header_paragraph_ul.png)

When you're done, click on the **terminal** of the Learn IDE. Your `httpserver`
program should still be running there. To exit `httpserver` press `Control +
c`. This will tell `httpserver` to shut down and you should be back at the
prompt. 

Make sure that you have your HTML content in a file called `my_list.html` in
order to pass the check. Type `learn` and verify that your tests pass.

Once you've passed the test, run the command `learn submit`. This will log your
progress to our systems. You're ready to move on to the next lesson!

## Conclusion

In this lab, you have done the job of an HTML author. You
receive raw _content_, you _mark it up_ to create _source text_. You test,
tweak and adjust your _source text_ until the _rendered text_ displayed in the
browser is to your liking. 

In upcoming lessons, we will learn additional tags which provide us more
ways to describe our content. We might be starting with lists today, but soon
we'll be on this in exciting ways!

Welcome to the community of web page creators!

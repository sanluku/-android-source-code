/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package fr.castorflex.android.flipimageview;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int flipDrawable=0x7f010002;
        /** <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int flipDuration=0x7f010003;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int flipInterpolator=0x7f010004;
        /** <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td></td></tr>
<tr><td><code>x</code></td><td>1</td><td></td></tr>
<tr><td><code>y</code></td><td>2</td><td></td></tr>
<tr><td><code>z</code></td><td>4</td><td></td></tr>
</table>
         */
        public static final int flipRotations=0x7f010005;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int isAnimated=0x7f010000;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int isFlipped=0x7f010001;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int reverseRotation=0x7f010006;
    }
    public static final class bool {
        public static final int default_fiv_isAnimated=0x7f050000;
        public static final int default_fiv_isFlipped=0x7f050001;
        /** Default rotation is CCW
         */
        public static final int default_fiv_isRotationReversed=0x7f050002;
    }
    public static final class drawable {
        public static final int ic_action_star_0=0x7f020000;
        public static final int ic_action_star_10=0x7f020001;
        public static final int ic_launcher=0x7f020002;
    }
    public static final class id {
        public static final int checkedtextview_reverse=0x7f04000c;
        public static final int checkedtextview_x=0x7f040009;
        public static final int checkedtextview_y=0x7f04000a;
        public static final int checkedtextview_z=0x7f04000b;
        public static final int imageview=0x7f040004;
        public static final int none=0x7f040000;
        public static final int seekbar=0x7f040007;
        public static final int spinner=0x7f040006;
        public static final int textview=0x7f040005;
        public static final int textview_duration=0x7f040008;
        public static final int x=0x7f040001;
        public static final int y=0x7f040002;
        public static final int z=0x7f040003;
    }
    public static final class integer {
        public static final int default_fiv_duration=0x7f060000;
        /** Rotation Y
         */
        public static final int default_fiv_rotations=0x7f060001;
    }
    public static final class layout {
        public static final int main=0x7f030000;
    }
    public static final class string {
        public static final int app_name=0x7f070000;
    }
    public static final class styleable {
        /** Attributes that can be used with a FlipImageView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #FlipImageView_flipDrawable fr.castorflex.android.flipimageview:flipDrawable}</code></td><td></td></tr>
           <tr><td><code>{@link #FlipImageView_flipDuration fr.castorflex.android.flipimageview:flipDuration}</code></td><td></td></tr>
           <tr><td><code>{@link #FlipImageView_flipInterpolator fr.castorflex.android.flipimageview:flipInterpolator}</code></td><td></td></tr>
           <tr><td><code>{@link #FlipImageView_flipRotations fr.castorflex.android.flipimageview:flipRotations}</code></td><td></td></tr>
           <tr><td><code>{@link #FlipImageView_isAnimated fr.castorflex.android.flipimageview:isAnimated}</code></td><td></td></tr>
           <tr><td><code>{@link #FlipImageView_isFlipped fr.castorflex.android.flipimageview:isFlipped}</code></td><td></td></tr>
           <tr><td><code>{@link #FlipImageView_reverseRotation fr.castorflex.android.flipimageview:reverseRotation}</code></td><td></td></tr>
           </table>
           @see #FlipImageView_flipDrawable
           @see #FlipImageView_flipDuration
           @see #FlipImageView_flipInterpolator
           @see #FlipImageView_flipRotations
           @see #FlipImageView_isAnimated
           @see #FlipImageView_isFlipped
           @see #FlipImageView_reverseRotation
         */
        public static final int[] FlipImageView = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005, 0x7f010006
        };
        /**
          <p>This symbol is the offset where the {@link fr.castorflex.android.flipimageview.R.attr#flipDrawable}
          attribute's value can be found in the {@link #FlipImageView} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:flipDrawable
        */
        public static final int FlipImageView_flipDrawable = 2;
        /**
          <p>This symbol is the offset where the {@link fr.castorflex.android.flipimageview.R.attr#flipDuration}
          attribute's value can be found in the {@link #FlipImageView} array.


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:flipDuration
        */
        public static final int FlipImageView_flipDuration = 3;
        /**
          <p>This symbol is the offset where the {@link fr.castorflex.android.flipimageview.R.attr#flipInterpolator}
          attribute's value can be found in the {@link #FlipImageView} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:flipInterpolator
        */
        public static final int FlipImageView_flipInterpolator = 4;
        /**
          <p>This symbol is the offset where the {@link fr.castorflex.android.flipimageview.R.attr#flipRotations}
          attribute's value can be found in the {@link #FlipImageView} array.


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td></td></tr>
<tr><td><code>x</code></td><td>1</td><td></td></tr>
<tr><td><code>y</code></td><td>2</td><td></td></tr>
<tr><td><code>z</code></td><td>4</td><td></td></tr>
</table>
          @attr name android:flipRotations
        */
        public static final int FlipImageView_flipRotations = 5;
        /**
          <p>This symbol is the offset where the {@link fr.castorflex.android.flipimageview.R.attr#isAnimated}
          attribute's value can be found in the {@link #FlipImageView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:isAnimated
        */
        public static final int FlipImageView_isAnimated = 0;
        /**
          <p>This symbol is the offset where the {@link fr.castorflex.android.flipimageview.R.attr#isFlipped}
          attribute's value can be found in the {@link #FlipImageView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:isFlipped
        */
        public static final int FlipImageView_isFlipped = 1;
        /**
          <p>This symbol is the offset where the {@link fr.castorflex.android.flipimageview.R.attr#reverseRotation}
          attribute's value can be found in the {@link #FlipImageView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:reverseRotation
        */
        public static final int FlipImageView_reverseRotation = 6;
    };
}

# Change Log
All notable changes to the "calva-fmt" extension will be documented in this file. (At least when I remember to update it.)

## Future

### Thinking About
- Offer zprint as an option for formatting the whole file.

### Work in pogress
- Support for `:cljfmt` settings maps.

## 0.0.28 - 2018-11-26
- Add command for aligning map items, and bindings, in columns, `ctrl+alt+l`. (Exprimental)

## 0.0.26 - 2018-11-24
- Add experimental option to align map items, and bindings, in columns, `calva.fmt.allgnMapItems`, defaults to `false`.

## 0.0.23 - 2018-11-24
- Add **Indent/Dedent Line** commands, `ctrl+i` and `shift+ctrl+i`, respectively.

## 0.0.22 - 2018-11-22
- Add **Infer Parens** command, `ctrl+alt+p`.

## 0.0.15 - 2018-11-04
- Format code as new lines are entered, keeping things mostly formatted as you type.

## 0.0.14 - 2018-10-11
- Reformat current form works so nicely that it gets back the default key binding to `tab tab`.

## 0.0.9 - 2018-10-05
- Add user command for indenting current form

## 0.0.5 - 2018-07-18
- Expose `formatRange` in extension API.
- Expose `formatPosition` (formatting the current form based on cursor position) in extension API.

## 0.0.4 - 2018-06-23
- Use `clj-fmt` to auto-adjust of cursor position on new lines.

## 0.0.3 - 2018-06-20
- Calva Formatter is Calva's formatter.

## 0.0.2 - 2018-06-07
- Adjust cursor position on new lines as you type (using custom code).

## 0.0.1 - 2018-05-27
- Initial release.
- Format Selection.
- Fomrat on Save.
# Project 7 - Custom Styled RecyclerView App

Submitted by: **Annah Kasali**

**Project 7** is an Android application that displays a list of scrollable data in a `RecyclerView` with custom styling using Downloadable Google Fonts, modified themes, custom styles, and dark mode resource variants.

Time spent: **4** hours spent in total

---

## Functionality & Requirements

The following **required** functionality is completed:

- [x] **App contains a RecyclerView that displays a list of scrollable data**
- [x] **App displays at least two (2) pieces of data for each RecyclerView item**
  - Displays item icon/image, item title, and item description/subtitle.
- [x] **Styling features:**
  - [x] **Use a downloadable font with custom color and size**: Integrated Google Downloadable Font (`Lobster`) configured with custom color and size in `styles.xml`.
  - [x] **Modify the theme of the app in themes.xml**: Customized app primary, background, and surface colors in `themes.xml`.
  - [x] **Define and apply at least one style in either themes.xml or a new file styles.xml**: Created and applied `ItemTitleStyle` and `ItemDescriptionStyle` in `styles.xml`.

The following **stretch** features are completed:

- [x] **Different Resources or Themes for Dark Mode:**
  - [x] Update the night theme (`res/values-night/themes.xml`) to use different versions of styles when in dark mode.
  - [x] Change colors, fonts, and/or text attributes for dark mode in `res/values-night/styles.xml` and `res/values-night/colors.xml`.
  - [x] Use different drawables when in dark mode by adding `res/drawable-night/ic_item_logo.xml`.

---

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='walkthrough.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

---

## Notes

- Uses `ViewBinding` for safe XML layout view interaction.
- Uses `AppCompatActivity` and Material Design cards (`CardView`) for responsive layout design.

---

## License

    Copyright 2026 Annah Kasali

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    Engineers may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

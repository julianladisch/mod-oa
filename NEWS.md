## 1.1.0 2023-03-20
 * Modified p_main_email datatype from VARCHAR(36) to VARCHAR(255). Refs MODOA-44
 * Modified pr_title datatype from VARCHAR(255) to VARCHAR(4096) to accommodate longer publication titles. Refs MODOA-46
 * Fixed Checklist item definition name regex to handle special characters and language specific characters. Refs UIOA-211
 * Bumped dependencies for postgresql, opencsv, kafka-clients, commons-io. Refs MODOA-47

## 1.0.0 2023-01-10
 * Added domain model for Publication requests and partys
 * Added domain model for Charges
 * MODOA-4 Added domain model for journals
 * MODOA-7 Added domain model for agreements and links to publication request
 * MODOA-12 Added domain model for storing book/journal details within publication request 
 * MODOA-12 Added Correspondence domain class and links to publication request
 * Added ability for Invoice and Invoice lines to be linked to charges
 * Added Checklist/Checklist item domain model and links to publication request
 * Added report contrllers for generating Open APC reports
 
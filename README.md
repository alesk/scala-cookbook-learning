# Learning scala with a little help from Scala Cookbook


## Prepare test database

Download [paglia sample database](http://pgfoundry.org/frs/download.php/1719/pagila-0.10.1.zip).

Unzip package and execute:

```bash
createdb paglia
psql paglia < paglia-schema.sql
psql paglia < paglia-insert-data.sql
psql paglia < paglia-data.sql
```

## To run example

To run example, `cd` to example's directory and run `sbt ~run`.

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The data stored in text format.
 * 
 */
public final class TextFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final TextFormatArgs Empty = new TextFormatArgs();

    /**
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="columnDelimiter")
      private final @Nullable Input<Object> columnDelimiter;

    public Input<Object> getColumnDelimiter() {
        return this.columnDelimiter == null ? Input.empty() : this.columnDelimiter;
    }

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="deserializer")
      private final @Nullable Input<Object> deserializer;

    public Input<Object> getDeserializer() {
        return this.deserializer == null ? Input.empty() : this.deserializer;
    }

    /**
     * The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encodingName")
      private final @Nullable Input<Object> encodingName;

    public Input<Object> getEncodingName() {
        return this.encodingName == null ? Input.empty() : this.encodingName;
    }

    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="escapeChar")
      private final @Nullable Input<Object> escapeChar;

    public Input<Object> getEscapeChar() {
        return this.escapeChar == null ? Input.empty() : this.escapeChar;
    }

    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="firstRowAsHeader")
      private final @Nullable Input<Object> firstRowAsHeader;

    public Input<Object> getFirstRowAsHeader() {
        return this.firstRowAsHeader == null ? Input.empty() : this.firstRowAsHeader;
    }

    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="nullValue")
      private final @Nullable Input<Object> nullValue;

    public Input<Object> getNullValue() {
        return this.nullValue == null ? Input.empty() : this.nullValue;
    }

    /**
     * The quote character. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="quoteChar")
      private final @Nullable Input<Object> quoteChar;

    public Input<Object> getQuoteChar() {
        return this.quoteChar == null ? Input.empty() : this.quoteChar;
    }

    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="rowDelimiter")
      private final @Nullable Input<Object> rowDelimiter;

    public Input<Object> getRowDelimiter() {
        return this.rowDelimiter == null ? Input.empty() : this.rowDelimiter;
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="serializer")
      private final @Nullable Input<Object> serializer;

    public Input<Object> getSerializer() {
        return this.serializer == null ? Input.empty() : this.serializer;
    }

    /**
     * The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="skipLineCount")
      private final @Nullable Input<Object> skipLineCount;

    public Input<Object> getSkipLineCount() {
        return this.skipLineCount == null ? Input.empty() : this.skipLineCount;
    }

    /**
     * Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="treatEmptyAsNull")
      private final @Nullable Input<Object> treatEmptyAsNull;

    public Input<Object> getTreatEmptyAsNull() {
        return this.treatEmptyAsNull == null ? Input.empty() : this.treatEmptyAsNull;
    }

    /**
     * Type of dataset storage format.
     * Expected value is 'TextFormat'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TextFormatArgs(
        @Nullable Input<Object> columnDelimiter,
        @Nullable Input<Object> deserializer,
        @Nullable Input<Object> encodingName,
        @Nullable Input<Object> escapeChar,
        @Nullable Input<Object> firstRowAsHeader,
        @Nullable Input<Object> nullValue,
        @Nullable Input<Object> quoteChar,
        @Nullable Input<Object> rowDelimiter,
        @Nullable Input<Object> serializer,
        @Nullable Input<Object> skipLineCount,
        @Nullable Input<Object> treatEmptyAsNull,
        Input<String> type) {
        this.columnDelimiter = columnDelimiter;
        this.deserializer = deserializer;
        this.encodingName = encodingName;
        this.escapeChar = escapeChar;
        this.firstRowAsHeader = firstRowAsHeader;
        this.nullValue = nullValue;
        this.quoteChar = quoteChar;
        this.rowDelimiter = rowDelimiter;
        this.serializer = serializer;
        this.skipLineCount = skipLineCount;
        this.treatEmptyAsNull = treatEmptyAsNull;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TextFormatArgs() {
        this.columnDelimiter = Input.empty();
        this.deserializer = Input.empty();
        this.encodingName = Input.empty();
        this.escapeChar = Input.empty();
        this.firstRowAsHeader = Input.empty();
        this.nullValue = Input.empty();
        this.quoteChar = Input.empty();
        this.rowDelimiter = Input.empty();
        this.serializer = Input.empty();
        this.skipLineCount = Input.empty();
        this.treatEmptyAsNull = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TextFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> columnDelimiter;
        private @Nullable Input<Object> deserializer;
        private @Nullable Input<Object> encodingName;
        private @Nullable Input<Object> escapeChar;
        private @Nullable Input<Object> firstRowAsHeader;
        private @Nullable Input<Object> nullValue;
        private @Nullable Input<Object> quoteChar;
        private @Nullable Input<Object> rowDelimiter;
        private @Nullable Input<Object> serializer;
        private @Nullable Input<Object> skipLineCount;
        private @Nullable Input<Object> treatEmptyAsNull;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TextFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnDelimiter = defaults.columnDelimiter;
    	      this.deserializer = defaults.deserializer;
    	      this.encodingName = defaults.encodingName;
    	      this.escapeChar = defaults.escapeChar;
    	      this.firstRowAsHeader = defaults.firstRowAsHeader;
    	      this.nullValue = defaults.nullValue;
    	      this.quoteChar = defaults.quoteChar;
    	      this.rowDelimiter = defaults.rowDelimiter;
    	      this.serializer = defaults.serializer;
    	      this.skipLineCount = defaults.skipLineCount;
    	      this.treatEmptyAsNull = defaults.treatEmptyAsNull;
    	      this.type = defaults.type;
        }

        public Builder setColumnDelimiter(@Nullable Input<Object> columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            return this;
        }

        public Builder setColumnDelimiter(@Nullable Object columnDelimiter) {
            this.columnDelimiter = Input.ofNullable(columnDelimiter);
            return this;
        }

        public Builder setDeserializer(@Nullable Input<Object> deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setDeserializer(@Nullable Object deserializer) {
            this.deserializer = Input.ofNullable(deserializer);
            return this;
        }

        public Builder setEncodingName(@Nullable Input<Object> encodingName) {
            this.encodingName = encodingName;
            return this;
        }

        public Builder setEncodingName(@Nullable Object encodingName) {
            this.encodingName = Input.ofNullable(encodingName);
            return this;
        }

        public Builder setEscapeChar(@Nullable Input<Object> escapeChar) {
            this.escapeChar = escapeChar;
            return this;
        }

        public Builder setEscapeChar(@Nullable Object escapeChar) {
            this.escapeChar = Input.ofNullable(escapeChar);
            return this;
        }

        public Builder setFirstRowAsHeader(@Nullable Input<Object> firstRowAsHeader) {
            this.firstRowAsHeader = firstRowAsHeader;
            return this;
        }

        public Builder setFirstRowAsHeader(@Nullable Object firstRowAsHeader) {
            this.firstRowAsHeader = Input.ofNullable(firstRowAsHeader);
            return this;
        }

        public Builder setNullValue(@Nullable Input<Object> nullValue) {
            this.nullValue = nullValue;
            return this;
        }

        public Builder setNullValue(@Nullable Object nullValue) {
            this.nullValue = Input.ofNullable(nullValue);
            return this;
        }

        public Builder setQuoteChar(@Nullable Input<Object> quoteChar) {
            this.quoteChar = quoteChar;
            return this;
        }

        public Builder setQuoteChar(@Nullable Object quoteChar) {
            this.quoteChar = Input.ofNullable(quoteChar);
            return this;
        }

        public Builder setRowDelimiter(@Nullable Input<Object> rowDelimiter) {
            this.rowDelimiter = rowDelimiter;
            return this;
        }

        public Builder setRowDelimiter(@Nullable Object rowDelimiter) {
            this.rowDelimiter = Input.ofNullable(rowDelimiter);
            return this;
        }

        public Builder setSerializer(@Nullable Input<Object> serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder setSerializer(@Nullable Object serializer) {
            this.serializer = Input.ofNullable(serializer);
            return this;
        }

        public Builder setSkipLineCount(@Nullable Input<Object> skipLineCount) {
            this.skipLineCount = skipLineCount;
            return this;
        }

        public Builder setSkipLineCount(@Nullable Object skipLineCount) {
            this.skipLineCount = Input.ofNullable(skipLineCount);
            return this;
        }

        public Builder setTreatEmptyAsNull(@Nullable Input<Object> treatEmptyAsNull) {
            this.treatEmptyAsNull = treatEmptyAsNull;
            return this;
        }

        public Builder setTreatEmptyAsNull(@Nullable Object treatEmptyAsNull) {
            this.treatEmptyAsNull = Input.ofNullable(treatEmptyAsNull);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public TextFormatArgs build() {
            return new TextFormatArgs(columnDelimiter, deserializer, encodingName, escapeChar, firstRowAsHeader, nullValue, quoteChar, rowDelimiter, serializer, skipLineCount, treatEmptyAsNull, type);
        }
    }
}

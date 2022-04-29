// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLibraryMaskingFormatsLibraryMaskingFormatCollectionItemFormatEntry {
    /**
     * @return The name of the substitution column.
     * 
     */
    private final String columnName;
    /**
     * @return The description of the format entry.
     * 
     */
    private final String description;
    /**
     * @return The upper bound of the range within which all the original column values fall. The end date must be greater than or equal to the start date.
     * 
     */
    private final String endDate;
    /**
     * @return The maximum number of characters the generated strings should have. It can  be any integer greater than zero, but it must be greater than or equal to  the start length.
     * 
     */
    private final Integer endLength;
    /**
     * @return The upper bound of the range within which random decimal numbers should be generated. It must be greater than or equal to the start value. It supports  input of double type.
     * 
     */
    private final Double endValue;
    /**
     * @return The constant number to be used for masking.
     * 
     */
    private final Double fixedNumber;
    /**
     * @return The constant string to be used for masking.
     * 
     */
    private final String fixedString;
    /**
     * @return One or more reference columns to be used to group column values so that they can be shuffled within their own group. The grouping columns and  the column to be masked must belong to the same table.
     * 
     */
    private final List<String> groupingColumns;
    /**
     * @return The number of characters that should be there in the substring. It should be an integer and greater than zero.
     * 
     */
    private final Integer length;
    /**
     * @return A filter to return only the resources that match the specified library masking format OCID.
     * 
     */
    private final String libraryMaskingFormatId;
    /**
     * @return The post processing function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME format. It can be a standalone or packaged function, so PACKAGE_NAME is optional.
     * 
     */
    private final String postProcessingFunction;
    /**
     * @return A comma-separated list of values to be used to replace column values. The list can be of strings, numbers, or dates. The data type of each value in the list must be compatible with the data type of the column. The number of entries in the list cannot be more than 999.
     * 
     */
    private final List<String> randomLists;
    /**
     * @return The regular expression to be used for masking. For data with characters in the ASCII character set, providing a regular expression is optional. However, it  is required if the data contains multi-byte characters. If not provided, an  error is returned when a multi-byte character is found.
     * 
     */
    private final String regularExpression;
    /**
     * @return The value that should be used to replace the data matching the regular  expression. It can be a fixed string, fixed number, null value, or  SQL expression.
     * 
     */
    private final String replaceWith;
    /**
     * @return The name of the schema that contains the substitution column.
     * 
     */
    private final String schemaName;
    /**
     * @return The SQL expression to be used to generate the masked values. It can  consist of one or more values, operators, and SQL functions that  evaluate to a value. It can also contain substitution columns from  the same table. Specify the substitution columns within percent (%)  symbols.
     * 
     */
    private final String sqlExpression;
    /**
     * @return The lower bound of the range within which all the original column values fall. The start date must be less than or equal to the end date.
     * 
     */
    private final String startDate;
    /**
     * @return The minimum number of characters the generated strings should have. It can  be any integer greater than zero, but it must be less than or equal to the  end length.
     * 
     */
    private final Integer startLength;
    /**
     * @return The starting position in the original string from where the substring should be extracted. It can be either a positive or a negative integer. If It&#39;s negative, the counting starts from the end of the string.
     * 
     */
    private final Integer startPosition;
    /**
     * @return The lower bound of the range within which random decimal numbers should  be generated. It must be less than or equal to the end value. It supports  input of double type.
     * 
     */
    private final Double startValue;
    /**
     * @return The name of the table that contains the substitution column.
     * 
     */
    private final String tableName;
    /**
     * @return The type of the format entry.
     * 
     */
    private final String type;
    /**
     * @return The user-defined function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME format.  It can be a standalone or packaged function, so PACKAGE_NAME is optional.
     * 
     */
    private final String userDefinedFunction;

    @CustomType.Constructor
    private GetLibraryMaskingFormatsLibraryMaskingFormatCollectionItemFormatEntry(
        @CustomType.Parameter("columnName") String columnName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endDate") String endDate,
        @CustomType.Parameter("endLength") Integer endLength,
        @CustomType.Parameter("endValue") Double endValue,
        @CustomType.Parameter("fixedNumber") Double fixedNumber,
        @CustomType.Parameter("fixedString") String fixedString,
        @CustomType.Parameter("groupingColumns") List<String> groupingColumns,
        @CustomType.Parameter("length") Integer length,
        @CustomType.Parameter("libraryMaskingFormatId") String libraryMaskingFormatId,
        @CustomType.Parameter("postProcessingFunction") String postProcessingFunction,
        @CustomType.Parameter("randomLists") List<String> randomLists,
        @CustomType.Parameter("regularExpression") String regularExpression,
        @CustomType.Parameter("replaceWith") String replaceWith,
        @CustomType.Parameter("schemaName") String schemaName,
        @CustomType.Parameter("sqlExpression") String sqlExpression,
        @CustomType.Parameter("startDate") String startDate,
        @CustomType.Parameter("startLength") Integer startLength,
        @CustomType.Parameter("startPosition") Integer startPosition,
        @CustomType.Parameter("startValue") Double startValue,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userDefinedFunction") String userDefinedFunction) {
        this.columnName = columnName;
        this.description = description;
        this.endDate = endDate;
        this.endLength = endLength;
        this.endValue = endValue;
        this.fixedNumber = fixedNumber;
        this.fixedString = fixedString;
        this.groupingColumns = groupingColumns;
        this.length = length;
        this.libraryMaskingFormatId = libraryMaskingFormatId;
        this.postProcessingFunction = postProcessingFunction;
        this.randomLists = randomLists;
        this.regularExpression = regularExpression;
        this.replaceWith = replaceWith;
        this.schemaName = schemaName;
        this.sqlExpression = sqlExpression;
        this.startDate = startDate;
        this.startLength = startLength;
        this.startPosition = startPosition;
        this.startValue = startValue;
        this.tableName = tableName;
        this.type = type;
        this.userDefinedFunction = userDefinedFunction;
    }

    /**
     * @return The name of the substitution column.
     * 
     */
    public String columnName() {
        return this.columnName;
    }
    /**
     * @return The description of the format entry.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The upper bound of the range within which all the original column values fall. The end date must be greater than or equal to the start date.
     * 
     */
    public String endDate() {
        return this.endDate;
    }
    /**
     * @return The maximum number of characters the generated strings should have. It can  be any integer greater than zero, but it must be greater than or equal to  the start length.
     * 
     */
    public Integer endLength() {
        return this.endLength;
    }
    /**
     * @return The upper bound of the range within which random decimal numbers should be generated. It must be greater than or equal to the start value. It supports  input of double type.
     * 
     */
    public Double endValue() {
        return this.endValue;
    }
    /**
     * @return The constant number to be used for masking.
     * 
     */
    public Double fixedNumber() {
        return this.fixedNumber;
    }
    /**
     * @return The constant string to be used for masking.
     * 
     */
    public String fixedString() {
        return this.fixedString;
    }
    /**
     * @return One or more reference columns to be used to group column values so that they can be shuffled within their own group. The grouping columns and  the column to be masked must belong to the same table.
     * 
     */
    public List<String> groupingColumns() {
        return this.groupingColumns;
    }
    /**
     * @return The number of characters that should be there in the substring. It should be an integer and greater than zero.
     * 
     */
    public Integer length() {
        return this.length;
    }
    /**
     * @return A filter to return only the resources that match the specified library masking format OCID.
     * 
     */
    public String libraryMaskingFormatId() {
        return this.libraryMaskingFormatId;
    }
    /**
     * @return The post processing function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME format. It can be a standalone or packaged function, so PACKAGE_NAME is optional.
     * 
     */
    public String postProcessingFunction() {
        return this.postProcessingFunction;
    }
    /**
     * @return A comma-separated list of values to be used to replace column values. The list can be of strings, numbers, or dates. The data type of each value in the list must be compatible with the data type of the column. The number of entries in the list cannot be more than 999.
     * 
     */
    public List<String> randomLists() {
        return this.randomLists;
    }
    /**
     * @return The regular expression to be used for masking. For data with characters in the ASCII character set, providing a regular expression is optional. However, it  is required if the data contains multi-byte characters. If not provided, an  error is returned when a multi-byte character is found.
     * 
     */
    public String regularExpression() {
        return this.regularExpression;
    }
    /**
     * @return The value that should be used to replace the data matching the regular  expression. It can be a fixed string, fixed number, null value, or  SQL expression.
     * 
     */
    public String replaceWith() {
        return this.replaceWith;
    }
    /**
     * @return The name of the schema that contains the substitution column.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }
    /**
     * @return The SQL expression to be used to generate the masked values. It can  consist of one or more values, operators, and SQL functions that  evaluate to a value. It can also contain substitution columns from  the same table. Specify the substitution columns within percent (%)  symbols.
     * 
     */
    public String sqlExpression() {
        return this.sqlExpression;
    }
    /**
     * @return The lower bound of the range within which all the original column values fall. The start date must be less than or equal to the end date.
     * 
     */
    public String startDate() {
        return this.startDate;
    }
    /**
     * @return The minimum number of characters the generated strings should have. It can  be any integer greater than zero, but it must be less than or equal to the  end length.
     * 
     */
    public Integer startLength() {
        return this.startLength;
    }
    /**
     * @return The starting position in the original string from where the substring should be extracted. It can be either a positive or a negative integer. If It&#39;s negative, the counting starts from the end of the string.
     * 
     */
    public Integer startPosition() {
        return this.startPosition;
    }
    /**
     * @return The lower bound of the range within which random decimal numbers should  be generated. It must be less than or equal to the end value. It supports  input of double type.
     * 
     */
    public Double startValue() {
        return this.startValue;
    }
    /**
     * @return The name of the table that contains the substitution column.
     * 
     */
    public String tableName() {
        return this.tableName;
    }
    /**
     * @return The type of the format entry.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The user-defined function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME format.  It can be a standalone or packaged function, so PACKAGE_NAME is optional.
     * 
     */
    public String userDefinedFunction() {
        return this.userDefinedFunction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLibraryMaskingFormatsLibraryMaskingFormatCollectionItemFormatEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String description;
        private String endDate;
        private Integer endLength;
        private Double endValue;
        private Double fixedNumber;
        private String fixedString;
        private List<String> groupingColumns;
        private Integer length;
        private String libraryMaskingFormatId;
        private String postProcessingFunction;
        private List<String> randomLists;
        private String regularExpression;
        private String replaceWith;
        private String schemaName;
        private String sqlExpression;
        private String startDate;
        private Integer startLength;
        private Integer startPosition;
        private Double startValue;
        private String tableName;
        private String type;
        private String userDefinedFunction;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLibraryMaskingFormatsLibraryMaskingFormatCollectionItemFormatEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.description = defaults.description;
    	      this.endDate = defaults.endDate;
    	      this.endLength = defaults.endLength;
    	      this.endValue = defaults.endValue;
    	      this.fixedNumber = defaults.fixedNumber;
    	      this.fixedString = defaults.fixedString;
    	      this.groupingColumns = defaults.groupingColumns;
    	      this.length = defaults.length;
    	      this.libraryMaskingFormatId = defaults.libraryMaskingFormatId;
    	      this.postProcessingFunction = defaults.postProcessingFunction;
    	      this.randomLists = defaults.randomLists;
    	      this.regularExpression = defaults.regularExpression;
    	      this.replaceWith = defaults.replaceWith;
    	      this.schemaName = defaults.schemaName;
    	      this.sqlExpression = defaults.sqlExpression;
    	      this.startDate = defaults.startDate;
    	      this.startLength = defaults.startLength;
    	      this.startPosition = defaults.startPosition;
    	      this.startValue = defaults.startValue;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
    	      this.userDefinedFunction = defaults.userDefinedFunction;
        }

        public Builder columnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endDate(String endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }
        public Builder endLength(Integer endLength) {
            this.endLength = Objects.requireNonNull(endLength);
            return this;
        }
        public Builder endValue(Double endValue) {
            this.endValue = Objects.requireNonNull(endValue);
            return this;
        }
        public Builder fixedNumber(Double fixedNumber) {
            this.fixedNumber = Objects.requireNonNull(fixedNumber);
            return this;
        }
        public Builder fixedString(String fixedString) {
            this.fixedString = Objects.requireNonNull(fixedString);
            return this;
        }
        public Builder groupingColumns(List<String> groupingColumns) {
            this.groupingColumns = Objects.requireNonNull(groupingColumns);
            return this;
        }
        public Builder groupingColumns(String... groupingColumns) {
            return groupingColumns(List.of(groupingColumns));
        }
        public Builder length(Integer length) {
            this.length = Objects.requireNonNull(length);
            return this;
        }
        public Builder libraryMaskingFormatId(String libraryMaskingFormatId) {
            this.libraryMaskingFormatId = Objects.requireNonNull(libraryMaskingFormatId);
            return this;
        }
        public Builder postProcessingFunction(String postProcessingFunction) {
            this.postProcessingFunction = Objects.requireNonNull(postProcessingFunction);
            return this;
        }
        public Builder randomLists(List<String> randomLists) {
            this.randomLists = Objects.requireNonNull(randomLists);
            return this;
        }
        public Builder randomLists(String... randomLists) {
            return randomLists(List.of(randomLists));
        }
        public Builder regularExpression(String regularExpression) {
            this.regularExpression = Objects.requireNonNull(regularExpression);
            return this;
        }
        public Builder replaceWith(String replaceWith) {
            this.replaceWith = Objects.requireNonNull(replaceWith);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public Builder sqlExpression(String sqlExpression) {
            this.sqlExpression = Objects.requireNonNull(sqlExpression);
            return this;
        }
        public Builder startDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        public Builder startLength(Integer startLength) {
            this.startLength = Objects.requireNonNull(startLength);
            return this;
        }
        public Builder startPosition(Integer startPosition) {
            this.startPosition = Objects.requireNonNull(startPosition);
            return this;
        }
        public Builder startValue(Double startValue) {
            this.startValue = Objects.requireNonNull(startValue);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userDefinedFunction(String userDefinedFunction) {
            this.userDefinedFunction = Objects.requireNonNull(userDefinedFunction);
            return this;
        }        public GetLibraryMaskingFormatsLibraryMaskingFormatCollectionItemFormatEntry build() {
            return new GetLibraryMaskingFormatsLibraryMaskingFormatCollectionItemFormatEntry(columnName, description, endDate, endLength, endValue, fixedNumber, fixedString, groupingColumns, length, libraryMaskingFormatId, postProcessingFunction, randomLists, regularExpression, replaceWith, schemaName, sqlExpression, startDate, startLength, startPosition, startValue, tableName, type, userDefinedFunction);
        }
    }
}

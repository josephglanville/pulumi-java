// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle Column.
 * 
 */
public final class OracleColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleColumnArgs Empty = new OracleColumnArgs();

    /**
     * Column name.
     * 
     */
    @Import(name="column")
      private final @Nullable Output<String> column;

    public Output<String> getColumn() {
        return this.column == null ? Output.empty() : this.column;
    }

    /**
     * The Oracle data type.
     * 
     */
    @Import(name="dataType")
      private final @Nullable Output<String> dataType;

    public Output<String> getDataType() {
        return this.dataType == null ? Output.empty() : this.dataType;
    }

    /**
     * Column encoding.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> getEncoding() {
        return this.encoding == null ? Output.empty() : this.encoding;
    }

    /**
     * Column length.
     * 
     */
    @Import(name="length")
      private final @Nullable Output<Integer> length;

    public Output<Integer> getLength() {
        return this.length == null ? Output.empty() : this.length;
    }

    /**
     * Whether or not the column can accept a null value.
     * 
     */
    @Import(name="nullable")
      private final @Nullable Output<Boolean> nullable;

    public Output<Boolean> getNullable() {
        return this.nullable == null ? Output.empty() : this.nullable;
    }

    /**
     * The ordinal position of the column in the table.
     * 
     */
    @Import(name="ordinalPosition")
      private final @Nullable Output<Integer> ordinalPosition;

    public Output<Integer> getOrdinalPosition() {
        return this.ordinalPosition == null ? Output.empty() : this.ordinalPosition;
    }

    /**
     * Column precision.
     * 
     */
    @Import(name="precision")
      private final @Nullable Output<Integer> precision;

    public Output<Integer> getPrecision() {
        return this.precision == null ? Output.empty() : this.precision;
    }

    /**
     * Whether or not the column represents a primary key.
     * 
     */
    @Import(name="primaryKey")
      private final @Nullable Output<Boolean> primaryKey;

    public Output<Boolean> getPrimaryKey() {
        return this.primaryKey == null ? Output.empty() : this.primaryKey;
    }

    /**
     * Column scale.
     * 
     */
    @Import(name="scale")
      private final @Nullable Output<Integer> scale;

    public Output<Integer> getScale() {
        return this.scale == null ? Output.empty() : this.scale;
    }

    public OracleColumnArgs(
        @Nullable Output<String> column,
        @Nullable Output<String> dataType,
        @Nullable Output<String> encoding,
        @Nullable Output<Integer> length,
        @Nullable Output<Boolean> nullable,
        @Nullable Output<Integer> ordinalPosition,
        @Nullable Output<Integer> precision,
        @Nullable Output<Boolean> primaryKey,
        @Nullable Output<Integer> scale) {
        this.column = column;
        this.dataType = dataType;
        this.encoding = encoding;
        this.length = length;
        this.nullable = nullable;
        this.ordinalPosition = ordinalPosition;
        this.precision = precision;
        this.primaryKey = primaryKey;
        this.scale = scale;
    }

    private OracleColumnArgs() {
        this.column = Output.empty();
        this.dataType = Output.empty();
        this.encoding = Output.empty();
        this.length = Output.empty();
        this.nullable = Output.empty();
        this.ordinalPosition = Output.empty();
        this.precision = Output.empty();
        this.primaryKey = Output.empty();
        this.scale = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> column;
        private @Nullable Output<String> dataType;
        private @Nullable Output<String> encoding;
        private @Nullable Output<Integer> length;
        private @Nullable Output<Boolean> nullable;
        private @Nullable Output<Integer> ordinalPosition;
        private @Nullable Output<Integer> precision;
        private @Nullable Output<Boolean> primaryKey;
        private @Nullable Output<Integer> scale;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.dataType = defaults.dataType;
    	      this.encoding = defaults.encoding;
    	      this.length = defaults.length;
    	      this.nullable = defaults.nullable;
    	      this.ordinalPosition = defaults.ordinalPosition;
    	      this.precision = defaults.precision;
    	      this.primaryKey = defaults.primaryKey;
    	      this.scale = defaults.scale;
        }

        public Builder column(@Nullable Output<String> column) {
            this.column = column;
            return this;
        }
        public Builder column(@Nullable String column) {
            this.column = Output.ofNullable(column);
            return this;
        }
        public Builder dataType(@Nullable Output<String> dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder dataType(@Nullable String dataType) {
            this.dataType = Output.ofNullable(dataType);
            return this;
        }
        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = Output.ofNullable(encoding);
            return this;
        }
        public Builder length(@Nullable Output<Integer> length) {
            this.length = length;
            return this;
        }
        public Builder length(@Nullable Integer length) {
            this.length = Output.ofNullable(length);
            return this;
        }
        public Builder nullable(@Nullable Output<Boolean> nullable) {
            this.nullable = nullable;
            return this;
        }
        public Builder nullable(@Nullable Boolean nullable) {
            this.nullable = Output.ofNullable(nullable);
            return this;
        }
        public Builder ordinalPosition(@Nullable Output<Integer> ordinalPosition) {
            this.ordinalPosition = ordinalPosition;
            return this;
        }
        public Builder ordinalPosition(@Nullable Integer ordinalPosition) {
            this.ordinalPosition = Output.ofNullable(ordinalPosition);
            return this;
        }
        public Builder precision(@Nullable Output<Integer> precision) {
            this.precision = precision;
            return this;
        }
        public Builder precision(@Nullable Integer precision) {
            this.precision = Output.ofNullable(precision);
            return this;
        }
        public Builder primaryKey(@Nullable Output<Boolean> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder primaryKey(@Nullable Boolean primaryKey) {
            this.primaryKey = Output.ofNullable(primaryKey);
            return this;
        }
        public Builder scale(@Nullable Output<Integer> scale) {
            this.scale = scale;
            return this;
        }
        public Builder scale(@Nullable Integer scale) {
            this.scale = Output.ofNullable(scale);
            return this;
        }        public OracleColumnArgs build() {
            return new OracleColumnArgs(column, dataType, encoding, length, nullable, ordinalPosition, precision, primaryKey, scale);
        }
    }
}

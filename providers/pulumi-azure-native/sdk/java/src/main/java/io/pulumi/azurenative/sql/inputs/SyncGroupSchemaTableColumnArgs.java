// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of column in sync group table.
 * 
 */
public final class SyncGroupSchemaTableColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyncGroupSchemaTableColumnArgs Empty = new SyncGroupSchemaTableColumnArgs();

    /**
     * Data size of the column.
     * 
     */
    @InputImport(name="dataSize")
      private final @Nullable Input<String> dataSize;

    public Input<String> getDataSize() {
        return this.dataSize == null ? Input.empty() : this.dataSize;
    }

    /**
     * Data type of the column.
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable Input<String> dataType;

    public Input<String> getDataType() {
        return this.dataType == null ? Input.empty() : this.dataType;
    }

    /**
     * Quoted name of sync group table column.
     * 
     */
    @InputImport(name="quotedName")
      private final @Nullable Input<String> quotedName;

    public Input<String> getQuotedName() {
        return this.quotedName == null ? Input.empty() : this.quotedName;
    }

    public SyncGroupSchemaTableColumnArgs(
        @Nullable Input<String> dataSize,
        @Nullable Input<String> dataType,
        @Nullable Input<String> quotedName) {
        this.dataSize = dataSize;
        this.dataType = dataType;
        this.quotedName = quotedName;
    }

    private SyncGroupSchemaTableColumnArgs() {
        this.dataSize = Input.empty();
        this.dataType = Input.empty();
        this.quotedName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncGroupSchemaTableColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataSize;
        private @Nullable Input<String> dataType;
        private @Nullable Input<String> quotedName;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncGroupSchemaTableColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSize = defaults.dataSize;
    	      this.dataType = defaults.dataType;
    	      this.quotedName = defaults.quotedName;
        }

        public Builder setDataSize(@Nullable Input<String> dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        public Builder setDataSize(@Nullable String dataSize) {
            this.dataSize = Input.ofNullable(dataSize);
            return this;
        }

        public Builder setDataType(@Nullable Input<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = Input.ofNullable(dataType);
            return this;
        }

        public Builder setQuotedName(@Nullable Input<String> quotedName) {
            this.quotedName = quotedName;
            return this;
        }

        public Builder setQuotedName(@Nullable String quotedName) {
            this.quotedName = Input.ofNullable(quotedName);
            return this;
        }
        public SyncGroupSchemaTableColumnArgs build() {
            return new SyncGroupSchemaTableColumnArgs(dataSize, dataType, quotedName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.inputs;

import io.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesGetArgs;
import io.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableState extends io.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * The ARN that uniquely identifies this table.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name of the Timestream database.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Codegen.empty() : this.databaseName;
    }

    /**
     * Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * 
     */
    @Import(name="magneticStoreWriteProperties")
      private final @Nullable Output<TableMagneticStoreWritePropertiesGetArgs> magneticStoreWriteProperties;

    public Output<TableMagneticStoreWritePropertiesGetArgs> getMagneticStoreWriteProperties() {
        return this.magneticStoreWriteProperties == null ? Codegen.empty() : this.magneticStoreWriteProperties;
    }

    /**
     * The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magnetic_store_retention_period_in_days` default to 73000 and `memory_store_retention_period_in_hours` defaults to 6.
     * 
     */
    @Import(name="retentionProperties")
      private final @Nullable Output<TableRetentionPropertiesGetArgs> retentionProperties;

    public Output<TableRetentionPropertiesGetArgs> getRetentionProperties() {
        return this.retentionProperties == null ? Codegen.empty() : this.retentionProperties;
    }

    /**
     * The name of the Timestream table.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName == null ? Codegen.empty() : this.tableName;
    }

    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public TableState(
        @Nullable Output<String> arn,
        @Nullable Output<String> databaseName,
        @Nullable Output<TableMagneticStoreWritePropertiesGetArgs> magneticStoreWriteProperties,
        @Nullable Output<TableRetentionPropertiesGetArgs> retentionProperties,
        @Nullable Output<String> tableName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.databaseName = databaseName;
        this.magneticStoreWriteProperties = magneticStoreWriteProperties;
        this.retentionProperties = retentionProperties;
        this.tableName = tableName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private TableState() {
        this.arn = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.magneticStoreWriteProperties = Codegen.empty();
        this.retentionProperties = Codegen.empty();
        this.tableName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<TableMagneticStoreWritePropertiesGetArgs> magneticStoreWriteProperties;
        private @Nullable Output<TableRetentionPropertiesGetArgs> retentionProperties;
        private @Nullable Output<String> tableName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(TableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.databaseName = defaults.databaseName;
    	      this.magneticStoreWriteProperties = defaults.magneticStoreWriteProperties;
    	      this.retentionProperties = defaults.retentionProperties;
    	      this.tableName = defaults.tableName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Codegen.ofNullable(databaseName);
            return this;
        }
        public Builder magneticStoreWriteProperties(@Nullable Output<TableMagneticStoreWritePropertiesGetArgs> magneticStoreWriteProperties) {
            this.magneticStoreWriteProperties = magneticStoreWriteProperties;
            return this;
        }
        public Builder magneticStoreWriteProperties(@Nullable TableMagneticStoreWritePropertiesGetArgs magneticStoreWriteProperties) {
            this.magneticStoreWriteProperties = Codegen.ofNullable(magneticStoreWriteProperties);
            return this;
        }
        public Builder retentionProperties(@Nullable Output<TableRetentionPropertiesGetArgs> retentionProperties) {
            this.retentionProperties = retentionProperties;
            return this;
        }
        public Builder retentionProperties(@Nullable TableRetentionPropertiesGetArgs retentionProperties) {
            this.retentionProperties = Codegen.ofNullable(retentionProperties);
            return this;
        }
        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = Codegen.ofNullable(tableName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public TableState build() {
            return new TableState(arn, databaseName, magneticStoreWriteProperties, retentionProperties, tableName, tags, tagsAll);
        }
    }
}

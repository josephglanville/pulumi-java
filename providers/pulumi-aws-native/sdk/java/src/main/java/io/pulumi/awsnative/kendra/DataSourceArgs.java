// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra;

import io.pulumi.awsnative.kendra.enums.DataSourceType;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    @Import(name="dataSourceConfiguration")
      private final @Nullable Output<DataSourceConfigurationArgs> dataSourceConfiguration;

    public Output<DataSourceConfigurationArgs> getDataSourceConfiguration() {
        return this.dataSourceConfiguration == null ? Output.empty() : this.dataSourceConfiguration;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="indexId", required=true)
      private final Output<String> indexId;

    public Output<String> getIndexId() {
        return this.indexId;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    @Import(name="schedule")
      private final @Nullable Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * Tags for labeling the data source
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DataSourceTagArgs>> tags;

    public Output<List<DataSourceTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="type", required=true)
      private final Output<DataSourceType> type;

    public Output<DataSourceType> getType() {
        return this.type;
    }

    public DataSourceArgs(
        @Nullable Output<DataSourceConfigurationArgs> dataSourceConfiguration,
        @Nullable Output<String> description,
        Output<String> indexId,
        @Nullable Output<String> name,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> schedule,
        @Nullable Output<List<DataSourceTagArgs>> tags,
        Output<DataSourceType> type) {
        this.dataSourceConfiguration = dataSourceConfiguration;
        this.description = description;
        this.indexId = Objects.requireNonNull(indexId, "expected parameter 'indexId' to be non-null");
        this.name = name;
        this.roleArn = roleArn;
        this.schedule = schedule;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DataSourceArgs() {
        this.dataSourceConfiguration = Output.empty();
        this.description = Output.empty();
        this.indexId = Output.empty();
        this.name = Output.empty();
        this.roleArn = Output.empty();
        this.schedule = Output.empty();
        this.tags = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceConfigurationArgs> dataSourceConfiguration;
        private @Nullable Output<String> description;
        private Output<String> indexId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> schedule;
        private @Nullable Output<List<DataSourceTagArgs>> tags;
        private Output<DataSourceType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceConfiguration = defaults.dataSourceConfiguration;
    	      this.description = defaults.description;
    	      this.indexId = defaults.indexId;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.schedule = defaults.schedule;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder dataSourceConfiguration(@Nullable Output<DataSourceConfigurationArgs> dataSourceConfiguration) {
            this.dataSourceConfiguration = dataSourceConfiguration;
            return this;
        }
        public Builder dataSourceConfiguration(@Nullable DataSourceConfigurationArgs dataSourceConfiguration) {
            this.dataSourceConfiguration = Output.ofNullable(dataSourceConfiguration);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder indexId(Output<String> indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }
        public Builder indexId(String indexId) {
            this.indexId = Output.of(Objects.requireNonNull(indexId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }
        public Builder schedule(@Nullable Output<String> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable String schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }
        public Builder tags(@Nullable Output<List<DataSourceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DataSourceTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(DataSourceTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder type(Output<DataSourceType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(DataSourceType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public DataSourceArgs build() {
            return new DataSourceArgs(dataSourceConfiguration, description, indexId, name, roleArn, schedule, tags, type);
        }
    }
}

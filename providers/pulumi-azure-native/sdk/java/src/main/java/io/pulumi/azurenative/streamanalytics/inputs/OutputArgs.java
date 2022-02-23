// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AvroSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.AzureDataLakeStoreOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.AzureSqlDatabaseOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.AzureTableOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.BlobOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.CsvSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.DocumentDbOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.EventHubOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.JsonSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.PowerBIOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.ServiceBusQueueOutputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.ServiceBusTopicOutputDataSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
 * 
 */
public final class OutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final OutputArgs Empty = new OutputArgs();

    /**
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="datasource")
      private final @Nullable Input<Object> datasource;

    public Input<Object> getDatasource() {
        return this.datasource == null ? Input.empty() : this.datasource;
    }

    /**
     * Resource name
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="serialization")
      private final @Nullable Input<Object> serialization;

    public Input<Object> getSerialization() {
        return this.serialization == null ? Input.empty() : this.serialization;
    }

    public OutputArgs(
        @Nullable Input<Object> datasource,
        @Nullable Input<String> name,
        @Nullable Input<Object> serialization) {
        this.datasource = datasource;
        this.name = name;
        this.serialization = serialization;
    }

    private OutputArgs() {
        this.datasource = Input.empty();
        this.name = Input.empty();
        this.serialization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> datasource;
        private @Nullable Input<String> name;
        private @Nullable Input<Object> serialization;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.name = defaults.name;
    	      this.serialization = defaults.serialization;
        }

        public Builder setDatasource(@Nullable Input<Object> datasource) {
            this.datasource = datasource;
            return this;
        }

        public Builder setDatasource(@Nullable Object datasource) {
            this.datasource = Input.ofNullable(datasource);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSerialization(@Nullable Input<Object> serialization) {
            this.serialization = serialization;
            return this;
        }

        public Builder setSerialization(@Nullable Object serialization) {
            this.serialization = Input.ofNullable(serialization);
            return this;
        }
        public OutputArgs build() {
            return new OutputArgs(datasource, name, serialization);
        }
    }
}

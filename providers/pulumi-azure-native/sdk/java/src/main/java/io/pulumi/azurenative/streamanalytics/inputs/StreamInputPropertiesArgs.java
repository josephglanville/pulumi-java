// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AvroSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.BlobStreamInputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.CsvSerializationArgs;
import io.pulumi.azurenative.streamanalytics.inputs.EventHubStreamInputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.IoTHubStreamInputDataSourceArgs;
import io.pulumi.azurenative.streamanalytics.inputs.JsonSerializationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamInputPropertiesArgs Empty = new StreamInputPropertiesArgs();

    @InputImport(name="datasource")
    private final @Nullable Input<Object> datasource;

    public Input<Object> getDatasource() {
        return this.datasource == null ? Input.empty() : this.datasource;
    }

    @InputImport(name="serialization")
    private final @Nullable Input<Object> serialization;

    public Input<Object> getSerialization() {
        return this.serialization == null ? Input.empty() : this.serialization;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public StreamInputPropertiesArgs(
        @Nullable Input<Object> datasource,
        @Nullable Input<Object> serialization,
        Input<String> type) {
        this.datasource = datasource;
        this.serialization = serialization;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StreamInputPropertiesArgs() {
        this.datasource = Input.empty();
        this.serialization = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> datasource;
        private @Nullable Input<Object> serialization;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder setDatasource(@Nullable Input<Object> datasource) {
            this.datasource = datasource;
            return this;
        }

        public Builder setDatasource(@Nullable Object datasource) {
            this.datasource = Input.ofNullable(datasource);
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public StreamInputPropertiesArgs build() {
            return new StreamInputPropertiesArgs(datasource, serialization, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.DataSourceConfigurationResponse;
import io.pulumi.azurenative.insights.outputs.SinkConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DataSourceResponse {
    private final DataSourceConfigurationResponse configuration;
    private final String kind;
    private final List<SinkConfigurationResponse> sinks;

    @OutputCustomType.Constructor({"configuration","kind","sinks"})
    private DataSourceResponse(
        DataSourceConfigurationResponse configuration,
        String kind,
        List<SinkConfigurationResponse> sinks) {
        this.configuration = Objects.requireNonNull(configuration);
        this.kind = Objects.requireNonNull(kind);
        this.sinks = Objects.requireNonNull(sinks);
    }

    public DataSourceConfigurationResponse getConfiguration() {
        return this.configuration;
    }
    public String getKind() {
        return this.kind;
    }
    public List<SinkConfigurationResponse> getSinks() {
        return this.sinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfigurationResponse configuration;
        private String kind;
        private List<SinkConfigurationResponse> sinks;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.kind = defaults.kind;
    	      this.sinks = defaults.sinks;
        }

        public Builder setConfiguration(DataSourceConfigurationResponse configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSinks(List<SinkConfigurationResponse> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }

        public DataSourceResponse build() {
            return new DataSourceResponse(configuration, kind, sinks);
        }
    }
}

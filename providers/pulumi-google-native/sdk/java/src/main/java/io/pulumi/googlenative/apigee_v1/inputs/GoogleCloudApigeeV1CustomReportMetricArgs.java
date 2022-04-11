// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This encapsulates a metric property of the form sum(message_count) where name is message_count and function is sum
 * 
 */
public final class GoogleCloudApigeeV1CustomReportMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1CustomReportMetricArgs Empty = new GoogleCloudApigeeV1CustomReportMetricArgs();

    /**
     * aggregate function
     * 
     */
    @Import(name="function")
      private final @Nullable Output<String> function;

    public Output<String> getFunction() {
        return this.function == null ? Codegen.empty() : this.function;
    }

    /**
     * name of the metric
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public GoogleCloudApigeeV1CustomReportMetricArgs(
        @Nullable Output<String> function,
        @Nullable Output<String> name) {
        this.function = function;
        this.name = name;
    }

    private GoogleCloudApigeeV1CustomReportMetricArgs() {
        this.function = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1CustomReportMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> function;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1CustomReportMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder function(@Nullable Output<String> function) {
            this.function = function;
            return this;
        }
        public Builder function(@Nullable String function) {
            this.function = Codegen.ofNullable(function);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public GoogleCloudApigeeV1CustomReportMetricArgs build() {
            return new GoogleCloudApigeeV1CustomReportMetricArgs(function, name);
        }
    }
}

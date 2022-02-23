// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SinkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SinkConfigurationArgs Empty = new SinkConfigurationArgs();

    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    public SinkConfigurationArgs(Input<String> kind) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private SinkConfigurationArgs() {
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SinkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SinkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }
        public SinkConfigurationArgs build() {
            return new SinkConfigurationArgs(kind);
        }
    }
}

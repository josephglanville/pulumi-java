// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNodeArgs Empty = new InstanceNodeArgs();

    /**
     * an identifier for the resource with format `projects/{{project}}/locations/{{region}}/instances/{{name}}`
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceNodeArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> zone) {
        this.id = id;
        this.zone = zone;
    }

    private InstanceNodeArgs() {
        this.id = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.zone = defaults.zone;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public InstanceNodeArgs build() {
            return new InstanceNodeArgs(id, zone);
        }
    }
}

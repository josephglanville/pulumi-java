// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNodeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNodeGetArgs Empty = new InstanceNodeGetArgs();

    /**
     * an identifier for the resource with format `projects/{{project}}/locations/{{region}}/instances/{{name}}`
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public InstanceNodeGetArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> zone) {
        this.id = id;
        this.zone = zone;
    }

    private InstanceNodeGetArgs() {
        this.id = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNodeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNodeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.zone = defaults.zone;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public InstanceNodeGetArgs build() {
            return new InstanceNodeGetArgs(id, zone);
        }
    }
}

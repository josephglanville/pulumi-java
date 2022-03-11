// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyRingArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyRingArgs Empty = new KeyRingArgs();

    @InputImport(name="keyRingId", required=true)
      private final Output<String> keyRingId;

    public Output<String> getKeyRingId() {
        return this.keyRingId;
    }

    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public KeyRingArgs(
        Output<String> keyRingId,
        @Nullable Output<String> location,
        @Nullable Output<String> project) {
        this.keyRingId = Objects.requireNonNull(keyRingId, "expected parameter 'keyRingId' to be non-null");
        this.location = location;
        this.project = project;
    }

    private KeyRingArgs() {
        this.keyRingId = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyRingId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyRingId = defaults.keyRingId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder keyRingId(Output<String> keyRingId) {
            this.keyRingId = Objects.requireNonNull(keyRingId);
            return this;
        }

        public Builder keyRingId(String keyRingId) {
            this.keyRingId = Output.of(Objects.requireNonNull(keyRingId));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public KeyRingArgs build() {
            return new KeyRingArgs(keyRingId, location, project);
        }
    }
}

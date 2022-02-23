// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelsArgs Empty = new AccessLevelsArgs();

    /**
     * The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="accessLevels")
      private final @Nullable Input<List<AccessLevelsAccessLevelArgs>> accessLevels;

    public Input<List<AccessLevelsAccessLevelArgs>> getAccessLevels() {
        return this.accessLevels == null ? Input.empty() : this.accessLevels;
    }

    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @InputImport(name="parent", required=true)
      private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    public AccessLevelsArgs(
        @Nullable Input<List<AccessLevelsAccessLevelArgs>> accessLevels,
        Input<String> parent) {
        this.accessLevels = accessLevels;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
    }

    private AccessLevelsArgs() {
        this.accessLevels = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AccessLevelsAccessLevelArgs>> accessLevels;
        private Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.parent = defaults.parent;
        }

        public Builder setAccessLevels(@Nullable Input<List<AccessLevelsAccessLevelArgs>> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder setAccessLevels(@Nullable List<AccessLevelsAccessLevelArgs> accessLevels) {
            this.accessLevels = Input.ofNullable(accessLevels);
            return this;
        }

        public Builder setParent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }
        public AccessLevelsArgs build() {
            return new AccessLevelsArgs(accessLevels, parent);
        }
    }
}

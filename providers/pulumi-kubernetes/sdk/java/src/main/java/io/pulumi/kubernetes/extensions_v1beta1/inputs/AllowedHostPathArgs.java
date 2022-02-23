// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined. Deprecated: use AllowedHostPath from policy API Group instead.
 * 
 */
public final class AllowedHostPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowedHostPathArgs Empty = new AllowedHostPathArgs();

    /**
     * pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
     * 
     * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
     * 
     */
    @InputImport(name="pathPrefix")
      private final @Nullable Input<String> pathPrefix;

    public Input<String> getPathPrefix() {
        return this.pathPrefix == null ? Input.empty() : this.pathPrefix;
    }

    /**
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    public AllowedHostPathArgs(
        @Nullable Input<String> pathPrefix,
        @Nullable Input<Boolean> readOnly) {
        this.pathPrefix = pathPrefix;
        this.readOnly = readOnly;
    }

    private AllowedHostPathArgs() {
        this.pathPrefix = Input.empty();
        this.readOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedHostPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pathPrefix;
        private @Nullable Input<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedHostPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathPrefix = defaults.pathPrefix;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setPathPrefix(@Nullable Input<String> pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        public Builder setPathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = Input.ofNullable(pathPrefix);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }
        public AllowedHostPathArgs build() {
            return new AllowedHostPathArgs(pathPrefix, readOnly);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecVolumeSecretItem {
    /**
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * 
     */
    private final String key;
    /**
     * Mode bits to use on this file, must be a value between 0000 and 0777. If
     * not specified, the volume defaultMode will be used. This might be in
     * conflict with other options that affect the file mode, like fsGroup, and
     * the result can be other mode bits set.
     * 
     */
    private final @Nullable Integer mode;
    /**
     * The relative path of the file to map the key to.
     * May not be an absolute path.
     * May not contain the path element '..'.
     * May not start with the string '..'.
     * 
     */
    private final String path;

    @CustomType.Constructor
    private ServiceTemplateSpecVolumeSecretItem(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("mode") @Nullable Integer mode,
        @CustomType.Parameter("path") String path) {
        this.key = key;
        this.mode = mode;
        this.path = path;
    }

    /**
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Mode bits to use on this file, must be a value between 0000 and 0777. If
     * not specified, the volume defaultMode will be used. This might be in
     * conflict with other options that affect the file mode, like fsGroup, and
     * the result can be other mode bits set.
     * 
    */
    public Optional<Integer> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The relative path of the file to map the key to.
     * May not be an absolute path.
     * May not contain the path element '..'.
     * May not start with the string '..'.
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecVolumeSecretItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable Integer mode;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecVolumeSecretItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder mode(@Nullable Integer mode) {
            this.mode = mode;
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public ServiceTemplateSpecVolumeSecretItem build() {
            return new ServiceTemplateSpecVolumeSecretItem(key, mode, path);
        }
    }
}

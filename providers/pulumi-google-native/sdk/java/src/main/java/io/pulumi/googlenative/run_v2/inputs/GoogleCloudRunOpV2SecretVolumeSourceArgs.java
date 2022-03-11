// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VersionToPathArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The secret's value will be presented as the content of a file whose name is defined in the item path. If no items are defined, the name of the file is the secret.
 * 
 */
public final class GoogleCloudRunOpV2SecretVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2SecretVolumeSourceArgs Empty = new GoogleCloudRunOpV2SecretVolumeSourceArgs();

    /**
     * Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. This might be in conflict with other options that affect the file mode, like fsGroup, and as a result, other mode bits could be set.
     * 
     */
    @InputImport(name="defaultMode")
      private final @Nullable Output<Integer> defaultMode;

    public Output<Integer> getDefaultMode() {
        return this.defaultMode == null ? Output.empty() : this.defaultMode;
    }

    /**
     * If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * 
     */
    @InputImport(name="items")
      private final @Nullable Output<List<GoogleCloudRunOpV2VersionToPathArgs>> items;

    public Output<List<GoogleCloudRunOpV2VersionToPathArgs>> getItems() {
        return this.items == null ? Output.empty() : this.items;
    }

    /**
     * The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    @InputImport(name="secret", required=true)
      private final Output<String> secret;

    public Output<String> getSecret() {
        return this.secret;
    }

    public GoogleCloudRunOpV2SecretVolumeSourceArgs(
        @Nullable Output<Integer> defaultMode,
        @Nullable Output<List<GoogleCloudRunOpV2VersionToPathArgs>> items,
        Output<String> secret) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private GoogleCloudRunOpV2SecretVolumeSourceArgs() {
        this.defaultMode = Output.empty();
        this.items = Output.empty();
        this.secret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2SecretVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> defaultMode;
        private @Nullable Output<List<GoogleCloudRunOpV2VersionToPathArgs>> items;
        private Output<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2SecretVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secret = defaults.secret;
        }

        public Builder defaultMode(@Nullable Output<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Output.ofNullable(defaultMode);
            return this;
        }

        public Builder items(@Nullable Output<List<GoogleCloudRunOpV2VersionToPathArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder items(@Nullable List<GoogleCloudRunOpV2VersionToPathArgs> items) {
            this.items = Output.ofNullable(items);
            return this;
        }

        public Builder secret(Output<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder secret(String secret) {
            this.secret = Output.of(Objects.requireNonNull(secret));
            return this;
        }
        public GoogleCloudRunOpV2SecretVolumeSourceArgs build() {
            return new GoogleCloudRunOpV2SecretVolumeSourceArgs(defaultMode, items, secret);
        }
    }
}

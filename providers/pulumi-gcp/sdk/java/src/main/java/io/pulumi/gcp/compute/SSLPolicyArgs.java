// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SSLPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SSLPolicyArgs Empty = new SSLPolicyArgs();

    /**
     * Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. This can be one of
     * `COMPATIBLE`, `MODERN`, `RESTRICTED`, or `CUSTOM`. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for which ciphers are available to use. **Note**: this argument
     * *must* be present when using the `CUSTOM` profile. This argument
     * *must not* be present when using any other profile.
     * 
     */
    @InputImport(name="customFeatures")
      private final @Nullable Input<List<String>> customFeatures;

    public Input<List<String>> getCustomFeatures() {
        return this.customFeatures == null ? Input.empty() : this.customFeatures;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The minimum version of SSL protocol that can be used by the clients
     * to establish a connection with the load balancer.
     * Default value is `TLS_1_0`.
     * Possible values are `TLS_1_0`, `TLS_1_1`, and `TLS_1_2`.
     * 
     */
    @InputImport(name="minTlsVersion")
      private final @Nullable Input<String> minTlsVersion;

    public Input<String> getMinTlsVersion() {
        return this.minTlsVersion == null ? Input.empty() : this.minTlsVersion;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for information on what cipher suites each profile provides. If
     * `CUSTOM` is used, the `custom_features` attribute **must be set**.
     * Default value is `COMPATIBLE`.
     * Possible values are `COMPATIBLE`, `MODERN`, `RESTRICTED`, and `CUSTOM`.
     * 
     */
    @InputImport(name="profile")
      private final @Nullable Input<String> profile;

    public Input<String> getProfile() {
        return this.profile == null ? Input.empty() : this.profile;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public SSLPolicyArgs(
        @Nullable Input<List<String>> customFeatures,
        @Nullable Input<String> description,
        @Nullable Input<String> minTlsVersion,
        @Nullable Input<String> name,
        @Nullable Input<String> profile,
        @Nullable Input<String> project) {
        this.customFeatures = customFeatures;
        this.description = description;
        this.minTlsVersion = minTlsVersion;
        this.name = name;
        this.profile = profile;
        this.project = project;
    }

    private SSLPolicyArgs() {
        this.customFeatures = Input.empty();
        this.description = Input.empty();
        this.minTlsVersion = Input.empty();
        this.name = Input.empty();
        this.profile = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSLPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> customFeatures;
        private @Nullable Input<String> description;
        private @Nullable Input<String> minTlsVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<String> profile;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(SSLPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.project = defaults.project;
        }

        public Builder setCustomFeatures(@Nullable Input<List<String>> customFeatures) {
            this.customFeatures = customFeatures;
            return this;
        }

        public Builder setCustomFeatures(@Nullable List<String> customFeatures) {
            this.customFeatures = Input.ofNullable(customFeatures);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMinTlsVersion(@Nullable Input<String> minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }

        public Builder setMinTlsVersion(@Nullable String minTlsVersion) {
            this.minTlsVersion = Input.ofNullable(minTlsVersion);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProfile(@Nullable Input<String> profile) {
            this.profile = profile;
            return this;
        }

        public Builder setProfile(@Nullable String profile) {
            this.profile = Input.ofNullable(profile);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public SSLPolicyArgs build() {
            return new SSLPolicyArgs(customFeatures, description, minTlsVersion, name, profile, project);
        }
    }
}

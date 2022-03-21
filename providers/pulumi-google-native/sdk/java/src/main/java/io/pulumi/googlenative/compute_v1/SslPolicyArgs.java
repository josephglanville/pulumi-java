// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.SslPolicyMinTlsVersion;
import io.pulumi.googlenative.compute_v1.enums.SslPolicyProfile;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslPolicyArgs Empty = new SslPolicyArgs();

    /**
     * A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    @Import(name="customFeatures")
      private final @Nullable Output<List<String>> customFeatures;

    public Output<List<String>> getCustomFeatures() {
        return this.customFeatures == null ? Output.empty() : this.customFeatures;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    @Import(name="minTlsVersion")
      private final @Nullable Output<SslPolicyMinTlsVersion> minTlsVersion;

    public Output<SslPolicyMinTlsVersion> getMinTlsVersion() {
        return this.minTlsVersion == null ? Output.empty() : this.minTlsVersion;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    @Import(name="profile")
      private final @Nullable Output<SslPolicyProfile> profile;

    public Output<SslPolicyProfile> getProfile() {
        return this.profile == null ? Output.empty() : this.profile;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    public SslPolicyArgs(
        @Nullable Output<List<String>> customFeatures,
        @Nullable Output<String> description,
        @Nullable Output<SslPolicyMinTlsVersion> minTlsVersion,
        @Nullable Output<String> name,
        @Nullable Output<SslPolicyProfile> profile,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId) {
        this.customFeatures = customFeatures;
        this.description = description;
        this.minTlsVersion = minTlsVersion;
        this.name = name;
        this.profile = profile;
        this.project = project;
        this.requestId = requestId;
    }

    private SslPolicyArgs() {
        this.customFeatures = Output.empty();
        this.description = Output.empty();
        this.minTlsVersion = Output.empty();
        this.name = Output.empty();
        this.profile = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> customFeatures;
        private @Nullable Output<String> description;
        private @Nullable Output<SslPolicyMinTlsVersion> minTlsVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<SslPolicyProfile> profile;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(SslPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
        }

        public Builder customFeatures(@Nullable Output<List<String>> customFeatures) {
            this.customFeatures = customFeatures;
            return this;
        }
        public Builder customFeatures(@Nullable List<String> customFeatures) {
            this.customFeatures = Output.ofNullable(customFeatures);
            return this;
        }
        public Builder customFeatures(String... customFeatures) {
            return customFeatures(List.of(customFeatures));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder minTlsVersion(@Nullable Output<SslPolicyMinTlsVersion> minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }
        public Builder minTlsVersion(@Nullable SslPolicyMinTlsVersion minTlsVersion) {
            this.minTlsVersion = Output.ofNullable(minTlsVersion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder profile(@Nullable Output<SslPolicyProfile> profile) {
            this.profile = profile;
            return this;
        }
        public Builder profile(@Nullable SslPolicyProfile profile) {
            this.profile = Output.ofNullable(profile);
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
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }        public SslPolicyArgs build() {
            return new SslPolicyArgs(customFeatures, description, minTlsVersion, name, profile, project, requestId);
        }
    }
}

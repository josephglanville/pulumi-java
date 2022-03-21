// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.CollectionOverrideArgs;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.CredentialArgs;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.OptionsArgs;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.TypeProviderLabelEntryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TypeProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypeProviderArgs Empty = new TypeProviderArgs();

    /**
     * Allows resource handling overrides for specific collections
     * 
     */
    @Import(name="collectionOverrides")
      private final @Nullable Output<List<CollectionOverrideArgs>> collectionOverrides;

    public Output<List<CollectionOverrideArgs>> getCollectionOverrides() {
        return this.collectionOverrides == null ? Output.empty() : this.collectionOverrides;
    }

    /**
     * Credential used when interacting with this type.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialArgs> credential;

    public Output<CredentialArgs> getCredential() {
        return this.credential == null ? Output.empty() : this.credential;
    }

    /**
     * List of up to 2 custom certificate authority roots to use for TLS authentication when making calls on behalf of this type provider. If set, TLS authentication will exclusively use these roots instead of relying on publicly trusted certificate authorities when validating TLS certificate authenticity. The certificates must be in base64-encoded PEM format. The maximum size of each certificate must not exceed 10KB.
     * 
     */
    @Import(name="customCertificateAuthorityRoots")
      private final @Nullable Output<List<String>> customCertificateAuthorityRoots;

    public Output<List<String>> getCustomCertificateAuthorityRoots() {
        return this.customCertificateAuthorityRoots == null ? Output.empty() : this.customCertificateAuthorityRoots;
    }

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Descriptor Url for the this type provider.
     * 
     */
    @Import(name="descriptorUrl")
      private final @Nullable Output<String> descriptorUrl;

    public Output<String> getDescriptorUrl() {
        return this.descriptorUrl == null ? Output.empty() : this.descriptorUrl;
    }

    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<TypeProviderLabelEntryArgs>> labels;

    public Output<List<TypeProviderLabelEntryArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Options to apply when handling any resources in this service.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<OptionsArgs> options;

    public Output<OptionsArgs> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public TypeProviderArgs(
        @Nullable Output<List<CollectionOverrideArgs>> collectionOverrides,
        @Nullable Output<CredentialArgs> credential,
        @Nullable Output<List<String>> customCertificateAuthorityRoots,
        @Nullable Output<String> description,
        @Nullable Output<String> descriptorUrl,
        @Nullable Output<List<TypeProviderLabelEntryArgs>> labels,
        @Nullable Output<String> name,
        @Nullable Output<OptionsArgs> options,
        @Nullable Output<String> project) {
        this.collectionOverrides = collectionOverrides;
        this.credential = credential;
        this.customCertificateAuthorityRoots = customCertificateAuthorityRoots;
        this.description = description;
        this.descriptorUrl = descriptorUrl;
        this.labels = labels;
        this.name = name;
        this.options = options;
        this.project = project;
    }

    private TypeProviderArgs() {
        this.collectionOverrides = Output.empty();
        this.credential = Output.empty();
        this.customCertificateAuthorityRoots = Output.empty();
        this.description = Output.empty();
        this.descriptorUrl = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.options = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CollectionOverrideArgs>> collectionOverrides;
        private @Nullable Output<CredentialArgs> credential;
        private @Nullable Output<List<String>> customCertificateAuthorityRoots;
        private @Nullable Output<String> description;
        private @Nullable Output<String> descriptorUrl;
        private @Nullable Output<List<TypeProviderLabelEntryArgs>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<OptionsArgs> options;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionOverrides = defaults.collectionOverrides;
    	      this.credential = defaults.credential;
    	      this.customCertificateAuthorityRoots = defaults.customCertificateAuthorityRoots;
    	      this.description = defaults.description;
    	      this.descriptorUrl = defaults.descriptorUrl;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.project = defaults.project;
        }

        public Builder collectionOverrides(@Nullable Output<List<CollectionOverrideArgs>> collectionOverrides) {
            this.collectionOverrides = collectionOverrides;
            return this;
        }
        public Builder collectionOverrides(@Nullable List<CollectionOverrideArgs> collectionOverrides) {
            this.collectionOverrides = Output.ofNullable(collectionOverrides);
            return this;
        }
        public Builder collectionOverrides(CollectionOverrideArgs... collectionOverrides) {
            return collectionOverrides(List.of(collectionOverrides));
        }
        public Builder credential(@Nullable Output<CredentialArgs> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable CredentialArgs credential) {
            this.credential = Output.ofNullable(credential);
            return this;
        }
        public Builder customCertificateAuthorityRoots(@Nullable Output<List<String>> customCertificateAuthorityRoots) {
            this.customCertificateAuthorityRoots = customCertificateAuthorityRoots;
            return this;
        }
        public Builder customCertificateAuthorityRoots(@Nullable List<String> customCertificateAuthorityRoots) {
            this.customCertificateAuthorityRoots = Output.ofNullable(customCertificateAuthorityRoots);
            return this;
        }
        public Builder customCertificateAuthorityRoots(String... customCertificateAuthorityRoots) {
            return customCertificateAuthorityRoots(List.of(customCertificateAuthorityRoots));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder descriptorUrl(@Nullable Output<String> descriptorUrl) {
            this.descriptorUrl = descriptorUrl;
            return this;
        }
        public Builder descriptorUrl(@Nullable String descriptorUrl) {
            this.descriptorUrl = Output.ofNullable(descriptorUrl);
            return this;
        }
        public Builder labels(@Nullable Output<List<TypeProviderLabelEntryArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<TypeProviderLabelEntryArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(TypeProviderLabelEntryArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder options(@Nullable Output<OptionsArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable OptionsArgs options) {
            this.options = Output.ofNullable(options);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public TypeProviderArgs build() {
            return new TypeProviderArgs(collectionOverrides, credential, customCertificateAuthorityRoots, description, descriptorUrl, labels, name, options, project);
        }
    }
}

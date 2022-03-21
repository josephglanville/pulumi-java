// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1beta.enums.AptRepositoryArchiveType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a single Apt package repository. This repository is added to a repo file that is stored at `/etc/apt/sources.list.d/google_osconfig.list`.
 * 
 */
public final class AptRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final AptRepositoryArgs Empty = new AptRepositoryArgs();

    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * 
     */
    @Import(name="archiveType")
      private final @Nullable Output<AptRepositoryArchiveType> archiveType;

    public Output<AptRepositoryArchiveType> getArchiveType() {
        return this.archiveType == null ? Output.empty() : this.archiveType;
    }

    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    @Import(name="components", required=true)
      private final Output<List<String>> components;

    public Output<List<String>> getComponents() {
        return this.components;
    }

    /**
     * Distribution of this repository.
     * 
     */
    @Import(name="distribution", required=true)
      private final Output<String> distribution;

    public Output<String> getDistribution() {
        return this.distribution;
    }

    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg` containing all the keys in any applied guest policy.
     * 
     */
    @Import(name="gpgKey")
      private final @Nullable Output<String> gpgKey;

    public Output<String> getGpgKey() {
        return this.gpgKey == null ? Output.empty() : this.gpgKey;
    }

    /**
     * URI for this repository.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    public AptRepositoryArgs(
        @Nullable Output<AptRepositoryArchiveType> archiveType,
        Output<List<String>> components,
        Output<String> distribution,
        @Nullable Output<String> gpgKey,
        Output<String> uri) {
        this.archiveType = archiveType;
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.gpgKey = gpgKey;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private AptRepositoryArgs() {
        this.archiveType = Output.empty();
        this.components = Output.empty();
        this.distribution = Output.empty();
        this.gpgKey = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AptRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AptRepositoryArchiveType> archiveType;
        private Output<List<String>> components;
        private Output<String> distribution;
        private @Nullable Output<String> gpgKey;
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(AptRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder archiveType(@Nullable Output<AptRepositoryArchiveType> archiveType) {
            this.archiveType = archiveType;
            return this;
        }
        public Builder archiveType(@Nullable AptRepositoryArchiveType archiveType) {
            this.archiveType = Output.ofNullable(archiveType);
            return this;
        }
        public Builder components(Output<List<String>> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(List<String> components) {
            this.components = Output.of(Objects.requireNonNull(components));
            return this;
        }
        public Builder components(String... components) {
            return components(List.of(components));
        }
        public Builder distribution(Output<String> distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }
        public Builder distribution(String distribution) {
            this.distribution = Output.of(Objects.requireNonNull(distribution));
            return this;
        }
        public Builder gpgKey(@Nullable Output<String> gpgKey) {
            this.gpgKey = gpgKey;
            return this;
        }
        public Builder gpgKey(@Nullable String gpgKey) {
            this.gpgKey = Output.ofNullable(gpgKey);
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }        public AptRepositoryArgs build() {
            return new AptRepositoryArgs(archiveType, components, distribution, gpgKey, uri);
        }
    }
}

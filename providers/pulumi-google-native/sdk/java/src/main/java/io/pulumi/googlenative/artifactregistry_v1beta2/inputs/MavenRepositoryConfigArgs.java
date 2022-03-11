// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.artifactregistry_v1beta2.enums.MavenRepositoryConfigVersionPolicy;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MavenRepositoryConfig is maven related repository details. Provides additional configuration details for repositories of the maven format type.
 * 
 */
public final class MavenRepositoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MavenRepositoryConfigArgs Empty = new MavenRepositoryConfigArgs();

    /**
     * The repository with this flag will allow publishing the same snapshot versions.
     * 
     */
    @InputImport(name="allowSnapshotOverwrites")
      private final @Nullable Output<Boolean> allowSnapshotOverwrites;

    public Output<Boolean> getAllowSnapshotOverwrites() {
        return this.allowSnapshotOverwrites == null ? Output.empty() : this.allowSnapshotOverwrites;
    }

    /**
     * Version policy defines the versions that the registry will accept.
     * 
     */
    @InputImport(name="versionPolicy")
      private final @Nullable Output<MavenRepositoryConfigVersionPolicy> versionPolicy;

    public Output<MavenRepositoryConfigVersionPolicy> getVersionPolicy() {
        return this.versionPolicy == null ? Output.empty() : this.versionPolicy;
    }

    public MavenRepositoryConfigArgs(
        @Nullable Output<Boolean> allowSnapshotOverwrites,
        @Nullable Output<MavenRepositoryConfigVersionPolicy> versionPolicy) {
        this.allowSnapshotOverwrites = allowSnapshotOverwrites;
        this.versionPolicy = versionPolicy;
    }

    private MavenRepositoryConfigArgs() {
        this.allowSnapshotOverwrites = Output.empty();
        this.versionPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MavenRepositoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowSnapshotOverwrites;
        private @Nullable Output<MavenRepositoryConfigVersionPolicy> versionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(MavenRepositoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSnapshotOverwrites = defaults.allowSnapshotOverwrites;
    	      this.versionPolicy = defaults.versionPolicy;
        }

        public Builder allowSnapshotOverwrites(@Nullable Output<Boolean> allowSnapshotOverwrites) {
            this.allowSnapshotOverwrites = allowSnapshotOverwrites;
            return this;
        }

        public Builder allowSnapshotOverwrites(@Nullable Boolean allowSnapshotOverwrites) {
            this.allowSnapshotOverwrites = Output.ofNullable(allowSnapshotOverwrites);
            return this;
        }

        public Builder versionPolicy(@Nullable Output<MavenRepositoryConfigVersionPolicy> versionPolicy) {
            this.versionPolicy = versionPolicy;
            return this;
        }

        public Builder versionPolicy(@Nullable MavenRepositoryConfigVersionPolicy versionPolicy) {
            this.versionPolicy = Output.ofNullable(versionPolicy);
            return this;
        }
        public MavenRepositoryConfigArgs build() {
            return new MavenRepositoryConfigArgs(allowSnapshotOverwrites, versionPolicy);
        }
    }
}

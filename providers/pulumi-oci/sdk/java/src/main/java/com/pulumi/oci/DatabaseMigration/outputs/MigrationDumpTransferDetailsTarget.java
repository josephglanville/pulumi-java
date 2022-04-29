// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrationDumpTransferDetailsTarget {
    /**
     * @return (Updatable) Type of dump transfer to use during migration in source or target host. Default kind is CURL
     * 
     */
    private final String kind;
    /**
     * @return (Updatable) Path to the Oracle Cloud Infrastructure CLI installation in the node.
     * 
     */
    private final @Nullable String ociHome;

    @CustomType.Constructor
    private MigrationDumpTransferDetailsTarget(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("ociHome") @Nullable String ociHome) {
        this.kind = kind;
        this.ociHome = ociHome;
    }

    /**
     * @return (Updatable) Type of dump transfer to use during migration in source or target host. Default kind is CURL
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return (Updatable) Path to the Oracle Cloud Infrastructure CLI installation in the node.
     * 
     */
    public Optional<String> ociHome() {
        return Optional.ofNullable(this.ociHome);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationDumpTransferDetailsTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private @Nullable String ociHome;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationDumpTransferDetailsTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.ociHome = defaults.ociHome;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder ociHome(@Nullable String ociHome) {
            this.ociHome = ociHome;
            return this;
        }        public MigrationDumpTransferDetailsTarget build() {
            return new MigrationDumpTransferDetailsTarget(kind, ociHome);
        }
    }
}

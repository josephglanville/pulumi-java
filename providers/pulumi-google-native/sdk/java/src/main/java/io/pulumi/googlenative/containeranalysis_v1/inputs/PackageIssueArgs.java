// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A detail for a distro and package this vulnerability occurrence was found in and its associated fix (if one is available).
 * 
 */
public final class PackageIssueArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageIssueArgs Empty = new PackageIssueArgs();

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was found in.
     * 
     */
    @Import(name="affectedCpeUri", required=true)
      private final Output<String> affectedCpeUri;

    public Output<String> getAffectedCpeUri() {
        return this.affectedCpeUri;
    }

    /**
     * The package this vulnerability was found in.
     * 
     */
    @Import(name="affectedPackage", required=true)
      private final Output<String> affectedPackage;

    public Output<String> getAffectedPackage() {
        return this.affectedPackage;
    }

    /**
     * The version of the package that is installed on the resource affected by this vulnerability.
     * 
     */
    @Import(name="affectedVersion", required=true)
      private final Output<VersionArgs> affectedVersion;

    public Output<VersionArgs> getAffectedVersion() {
        return this.affectedVersion;
    }

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability was fixed in. It is possible for this to be different from the affected_cpe_uri.
     * 
     */
    @Import(name="fixedCpeUri")
      private final @Nullable Output<String> fixedCpeUri;

    public Output<String> getFixedCpeUri() {
        return this.fixedCpeUri == null ? Codegen.empty() : this.fixedCpeUri;
    }

    /**
     * The package this vulnerability was fixed in. It is possible for this to be different from the affected_package.
     * 
     */
    @Import(name="fixedPackage")
      private final @Nullable Output<String> fixedPackage;

    public Output<String> getFixedPackage() {
        return this.fixedPackage == null ? Codegen.empty() : this.fixedPackage;
    }

    /**
     * The version of the package this vulnerability was fixed in. Setting this to VersionKind.MAXIMUM means no fix is yet available.
     * 
     */
    @Import(name="fixedVersion", required=true)
      private final Output<VersionArgs> fixedVersion;

    public Output<VersionArgs> getFixedVersion() {
        return this.fixedVersion;
    }

    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    @Import(name="packageType")
      private final @Nullable Output<String> packageType;

    public Output<String> getPackageType() {
        return this.packageType == null ? Codegen.empty() : this.packageType;
    }

    public PackageIssueArgs(
        Output<String> affectedCpeUri,
        Output<String> affectedPackage,
        Output<VersionArgs> affectedVersion,
        @Nullable Output<String> fixedCpeUri,
        @Nullable Output<String> fixedPackage,
        Output<VersionArgs> fixedVersion,
        @Nullable Output<String> packageType) {
        this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri, "expected parameter 'affectedCpeUri' to be non-null");
        this.affectedPackage = Objects.requireNonNull(affectedPackage, "expected parameter 'affectedPackage' to be non-null");
        this.affectedVersion = Objects.requireNonNull(affectedVersion, "expected parameter 'affectedVersion' to be non-null");
        this.fixedCpeUri = fixedCpeUri;
        this.fixedPackage = fixedPackage;
        this.fixedVersion = Objects.requireNonNull(fixedVersion, "expected parameter 'fixedVersion' to be non-null");
        this.packageType = packageType;
    }

    private PackageIssueArgs() {
        this.affectedCpeUri = Codegen.empty();
        this.affectedPackage = Codegen.empty();
        this.affectedVersion = Codegen.empty();
        this.fixedCpeUri = Codegen.empty();
        this.fixedPackage = Codegen.empty();
        this.fixedVersion = Codegen.empty();
        this.packageType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> affectedCpeUri;
        private Output<String> affectedPackage;
        private Output<VersionArgs> affectedVersion;
        private @Nullable Output<String> fixedCpeUri;
        private @Nullable Output<String> fixedPackage;
        private Output<VersionArgs> fixedVersion;
        private @Nullable Output<String> packageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCpeUri = defaults.affectedCpeUri;
    	      this.affectedPackage = defaults.affectedPackage;
    	      this.affectedVersion = defaults.affectedVersion;
    	      this.fixedCpeUri = defaults.fixedCpeUri;
    	      this.fixedPackage = defaults.fixedPackage;
    	      this.fixedVersion = defaults.fixedVersion;
    	      this.packageType = defaults.packageType;
        }

        public Builder affectedCpeUri(Output<String> affectedCpeUri) {
            this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri);
            return this;
        }
        public Builder affectedCpeUri(String affectedCpeUri) {
            this.affectedCpeUri = Output.of(Objects.requireNonNull(affectedCpeUri));
            return this;
        }
        public Builder affectedPackage(Output<String> affectedPackage) {
            this.affectedPackage = Objects.requireNonNull(affectedPackage);
            return this;
        }
        public Builder affectedPackage(String affectedPackage) {
            this.affectedPackage = Output.of(Objects.requireNonNull(affectedPackage));
            return this;
        }
        public Builder affectedVersion(Output<VersionArgs> affectedVersion) {
            this.affectedVersion = Objects.requireNonNull(affectedVersion);
            return this;
        }
        public Builder affectedVersion(VersionArgs affectedVersion) {
            this.affectedVersion = Output.of(Objects.requireNonNull(affectedVersion));
            return this;
        }
        public Builder fixedCpeUri(@Nullable Output<String> fixedCpeUri) {
            this.fixedCpeUri = fixedCpeUri;
            return this;
        }
        public Builder fixedCpeUri(@Nullable String fixedCpeUri) {
            this.fixedCpeUri = Codegen.ofNullable(fixedCpeUri);
            return this;
        }
        public Builder fixedPackage(@Nullable Output<String> fixedPackage) {
            this.fixedPackage = fixedPackage;
            return this;
        }
        public Builder fixedPackage(@Nullable String fixedPackage) {
            this.fixedPackage = Codegen.ofNullable(fixedPackage);
            return this;
        }
        public Builder fixedVersion(Output<VersionArgs> fixedVersion) {
            this.fixedVersion = Objects.requireNonNull(fixedVersion);
            return this;
        }
        public Builder fixedVersion(VersionArgs fixedVersion) {
            this.fixedVersion = Output.of(Objects.requireNonNull(fixedVersion));
            return this;
        }
        public Builder packageType(@Nullable Output<String> packageType) {
            this.packageType = packageType;
            return this;
        }
        public Builder packageType(@Nullable String packageType) {
            this.packageType = Codegen.ofNullable(packageType);
            return this;
        }        public PackageIssueArgs build() {
            return new PackageIssueArgs(affectedCpeUri, affectedPackage, affectedVersion, fixedCpeUri, fixedPackage, fixedVersion, packageType);
        }
    }
}

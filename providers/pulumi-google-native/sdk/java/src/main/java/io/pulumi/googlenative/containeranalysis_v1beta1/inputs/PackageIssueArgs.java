// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VulnerabilityLocationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This message wraps a location affected by a vulnerability and its associated fix (if one is available).
 * 
 */
public final class PackageIssueArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageIssueArgs Empty = new PackageIssueArgs();

    /**
     * The location of the vulnerability.
     * 
     */
    @Import(name="affectedLocation", required=true)
      private final Output<VulnerabilityLocationArgs> affectedLocation;

    public Output<VulnerabilityLocationArgs> getAffectedLocation() {
        return this.affectedLocation;
    }

    /**
     * The location of the available fix for vulnerability.
     * 
     */
    @Import(name="fixedLocation")
      private final @Nullable Output<VulnerabilityLocationArgs> fixedLocation;

    public Output<VulnerabilityLocationArgs> getFixedLocation() {
        return this.fixedLocation == null ? Output.empty() : this.fixedLocation;
    }

    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    @Import(name="packageType")
      private final @Nullable Output<String> packageType;

    public Output<String> getPackageType() {
        return this.packageType == null ? Output.empty() : this.packageType;
    }

    public PackageIssueArgs(
        Output<VulnerabilityLocationArgs> affectedLocation,
        @Nullable Output<VulnerabilityLocationArgs> fixedLocation,
        @Nullable Output<String> packageType) {
        this.affectedLocation = Objects.requireNonNull(affectedLocation, "expected parameter 'affectedLocation' to be non-null");
        this.fixedLocation = fixedLocation;
        this.packageType = packageType;
    }

    private PackageIssueArgs() {
        this.affectedLocation = Output.empty();
        this.fixedLocation = Output.empty();
        this.packageType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VulnerabilityLocationArgs> affectedLocation;
        private @Nullable Output<VulnerabilityLocationArgs> fixedLocation;
        private @Nullable Output<String> packageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedLocation = defaults.affectedLocation;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.packageType = defaults.packageType;
        }

        public Builder affectedLocation(Output<VulnerabilityLocationArgs> affectedLocation) {
            this.affectedLocation = Objects.requireNonNull(affectedLocation);
            return this;
        }
        public Builder affectedLocation(VulnerabilityLocationArgs affectedLocation) {
            this.affectedLocation = Output.of(Objects.requireNonNull(affectedLocation));
            return this;
        }
        public Builder fixedLocation(@Nullable Output<VulnerabilityLocationArgs> fixedLocation) {
            this.fixedLocation = fixedLocation;
            return this;
        }
        public Builder fixedLocation(@Nullable VulnerabilityLocationArgs fixedLocation) {
            this.fixedLocation = Output.ofNullable(fixedLocation);
            return this;
        }
        public Builder packageType(@Nullable Output<String> packageType) {
            this.packageType = packageType;
            return this;
        }
        public Builder packageType(@Nullable String packageType) {
            this.packageType = Output.ofNullable(packageType);
            return this;
        }        public PackageIssueArgs build() {
            return new PackageIssueArgs(affectedLocation, fixedLocation, packageType);
        }
    }
}

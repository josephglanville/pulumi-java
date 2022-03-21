// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VulnerabilityLocationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Identifies all appearances of this vulnerability in the package for a specific distro/location. For example: glibc in cpe:/o:debian:debian_linux:8 for versions 2.1 - 2.2
 * 
 */
public final class DetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final DetailResponse Empty = new DetailResponse();

    /**
     * The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar.
     * 
     */
    @Import(name="cpeUri", required=true)
      private final String cpeUri;

    public String getCpeUri() {
        return this.cpeUri;
    }

    /**
     * A vendor-specific description of this note.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The fix for this specific package version.
     * 
     */
    @Import(name="fixedLocation", required=true)
      private final VulnerabilityLocationResponse fixedLocation;

    public VulnerabilityLocationResponse getFixedLocation() {
        return this.fixedLocation;
    }

    /**
     * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    @Import(name="isObsolete", required=true)
      private final Boolean isObsolete;

    public Boolean getIsObsolete() {
        return this.isObsolete;
    }

    /**
     * The max version of the package in which the vulnerability exists.
     * 
     */
    @Import(name="maxAffectedVersion", required=true)
      private final VersionResponse maxAffectedVersion;

    public VersionResponse getMaxAffectedVersion() {
        return this.maxAffectedVersion;
    }

    /**
     * The min version of the package in which the vulnerability exists.
     * 
     */
    @Import(name="minAffectedVersion", required=true)
      private final VersionResponse minAffectedVersion;

    public VersionResponse getMinAffectedVersion() {
        return this.minAffectedVersion;
    }

    /**
     * The name of the package where the vulnerability was found.
     * 
     */
    @Import(name="package", required=true)
      private final String $package;

    public String get$package() {
        return this.$package;
    }

    /**
     * The type of package; whether native or non native(ruby gems, node.js packages etc).
     * 
     */
    @Import(name="packageType", required=true)
      private final String packageType;

    public String getPackageType() {
        return this.packageType;
    }

    /**
     * The severity (eg: distro assigned severity) for this vulnerability.
     * 
     */
    @Import(name="severityName", required=true)
      private final String severityName;

    public String getSeverityName() {
        return this.severityName;
    }

    /**
     * The source from which the information in this Detail was obtained.
     * 
     */
    @Import(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    /**
     * The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker.
     * 
     */
    @Import(name="sourceUpdateTime", required=true)
      private final String sourceUpdateTime;

    public String getSourceUpdateTime() {
        return this.sourceUpdateTime;
    }

    /**
     * The name of the vendor of the product.
     * 
     */
    @Import(name="vendor", required=true)
      private final String vendor;

    public String getVendor() {
        return this.vendor;
    }

    public DetailResponse(
        String cpeUri,
        String description,
        VulnerabilityLocationResponse fixedLocation,
        Boolean isObsolete,
        VersionResponse maxAffectedVersion,
        VersionResponse minAffectedVersion,
        String $package,
        String packageType,
        String severityName,
        String source,
        String sourceUpdateTime,
        String vendor) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.fixedLocation = Objects.requireNonNull(fixedLocation, "expected parameter 'fixedLocation' to be non-null");
        this.isObsolete = Objects.requireNonNull(isObsolete, "expected parameter 'isObsolete' to be non-null");
        this.maxAffectedVersion = Objects.requireNonNull(maxAffectedVersion, "expected parameter 'maxAffectedVersion' to be non-null");
        this.minAffectedVersion = Objects.requireNonNull(minAffectedVersion, "expected parameter 'minAffectedVersion' to be non-null");
        this.$package = Objects.requireNonNull($package, "expected parameter '$package' to be non-null");
        this.packageType = Objects.requireNonNull(packageType, "expected parameter 'packageType' to be non-null");
        this.severityName = Objects.requireNonNull(severityName, "expected parameter 'severityName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceUpdateTime = Objects.requireNonNull(sourceUpdateTime, "expected parameter 'sourceUpdateTime' to be non-null");
        this.vendor = Objects.requireNonNull(vendor, "expected parameter 'vendor' to be non-null");
    }

    private DetailResponse() {
        this.cpeUri = null;
        this.description = null;
        this.fixedLocation = null;
        this.isObsolete = null;
        this.maxAffectedVersion = null;
        this.minAffectedVersion = null;
        this.$package = null;
        this.packageType = null;
        this.severityName = null;
        this.source = null;
        this.sourceUpdateTime = null;
        this.vendor = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String description;
        private VulnerabilityLocationResponse fixedLocation;
        private Boolean isObsolete;
        private VersionResponse maxAffectedVersion;
        private VersionResponse minAffectedVersion;
        private String $package;
        private String packageType;
        private String severityName;
        private String source;
        private String sourceUpdateTime;
        private String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.isObsolete = defaults.isObsolete;
    	      this.maxAffectedVersion = defaults.maxAffectedVersion;
    	      this.minAffectedVersion = defaults.minAffectedVersion;
    	      this.$package = defaults.$package;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.sourceUpdateTime = defaults.sourceUpdateTime;
    	      this.vendor = defaults.vendor;
        }

        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fixedLocation(VulnerabilityLocationResponse fixedLocation) {
            this.fixedLocation = Objects.requireNonNull(fixedLocation);
            return this;
        }
        public Builder isObsolete(Boolean isObsolete) {
            this.isObsolete = Objects.requireNonNull(isObsolete);
            return this;
        }
        public Builder maxAffectedVersion(VersionResponse maxAffectedVersion) {
            this.maxAffectedVersion = Objects.requireNonNull(maxAffectedVersion);
            return this;
        }
        public Builder minAffectedVersion(VersionResponse minAffectedVersion) {
            this.minAffectedVersion = Objects.requireNonNull(minAffectedVersion);
            return this;
        }
        public Builder $package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder severityName(String severityName) {
            this.severityName = Objects.requireNonNull(severityName);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder sourceUpdateTime(String sourceUpdateTime) {
            this.sourceUpdateTime = Objects.requireNonNull(sourceUpdateTime);
            return this;
        }
        public Builder vendor(String vendor) {
            this.vendor = Objects.requireNonNull(vendor);
            return this;
        }        public DetailResponse build() {
            return new DetailResponse(cpeUri, description, fixedLocation, isObsolete, maxAffectedVersion, minAffectedVersion, $package, packageType, severityName, source, sourceUpdateTime, vendor);
        }
    }
}

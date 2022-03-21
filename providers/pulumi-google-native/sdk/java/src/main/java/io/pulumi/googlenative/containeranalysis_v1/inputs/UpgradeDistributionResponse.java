// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The Upgrade Distribution represents metadata about the Upgrade for each operating system (CPE). Some distributions have additional metadata around updates, classifying them into various categories and severities.
 * 
 */
public final class UpgradeDistributionResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpgradeDistributionResponse Empty = new UpgradeDistributionResponse();

    /**
     * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed. For Windows the classification is one of the category_ids listed at https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * 
     */
    @Import(name="classification", required=true)
      private final String classification;

    public String getClassification() {
        return this.classification;
    }

    /**
     * Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
     */
    @Import(name="cpeUri", required=true)
      private final String cpeUri;

    public String getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The cve tied to this Upgrade.
     * 
     */
    @Import(name="cve", required=true)
      private final List<String> cve;

    public List<String> getCve() {
        return this.cve;
    }

    /**
     * The severity as specified by the upstream operating system.
     * 
     */
    @Import(name="severity", required=true)
      private final String severity;

    public String getSeverity() {
        return this.severity;
    }

    public UpgradeDistributionResponse(
        String classification,
        String cpeUri,
        List<String> cve,
        String severity) {
        this.classification = Objects.requireNonNull(classification, "expected parameter 'classification' to be non-null");
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.cve = Objects.requireNonNull(cve, "expected parameter 'cve' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
    }

    private UpgradeDistributionResponse() {
        this.classification = null;
        this.cpeUri = null;
        this.cve = List.of();
        this.severity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeDistributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String classification;
        private String cpeUri;
        private List<String> cve;
        private String severity;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeDistributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.cpeUri = defaults.cpeUri;
    	      this.cve = defaults.cve;
    	      this.severity = defaults.severity;
        }

        public Builder classification(String classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }
        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder cve(List<String> cve) {
            this.cve = Objects.requireNonNull(cve);
            return this;
        }
        public Builder cve(String... cve) {
            return cve(List.of(cve));
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }        public UpgradeDistributionResponse build() {
            return new UpgradeDistributionResponse(classification, cpeUri, cve, severity);
        }
    }
}

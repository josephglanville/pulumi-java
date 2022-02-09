// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MediaGraphPemCertificateListResponse {
    private final List<String> certificates;
    private final String odataType;

    @OutputCustomType.Constructor({"certificates","odataType"})
    private MediaGraphPemCertificateListResponse(
        List<String> certificates,
        String odataType) {
        this.certificates = Objects.requireNonNull(certificates);
        this.odataType = Objects.requireNonNull(odataType);
    }

    public List<String> getCertificates() {
        return this.certificates;
    }
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphPemCertificateListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificates;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphPemCertificateListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.odataType = defaults.odataType;
        }

        public Builder setCertificates(List<String> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public MediaGraphPemCertificateListResponse build() {
            return new MediaGraphPemCertificateListResponse(certificates, odataType);
        }
    }
}

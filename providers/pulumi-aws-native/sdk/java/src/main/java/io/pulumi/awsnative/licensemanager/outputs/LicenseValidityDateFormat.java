// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LicenseValidityDateFormat {
    /**
     * Validity begin date for the license.
     * 
     */
    private final String begin;
    /**
     * Validity begin date for the license.
     * 
     */
    private final String end;

    @CustomType.Constructor
    private LicenseValidityDateFormat(
        @CustomType.Parameter("begin") String begin,
        @CustomType.Parameter("end") String end) {
        this.begin = begin;
        this.end = end;
    }

    /**
     * Validity begin date for the license.
     * 
    */
    public String getBegin() {
        return this.begin;
    }
    /**
     * Validity begin date for the license.
     * 
    */
    public String getEnd() {
        return this.end;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseValidityDateFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String begin;
        private String end;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseValidityDateFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.begin = defaults.begin;
    	      this.end = defaults.end;
        }

        public Builder begin(String begin) {
            this.begin = Objects.requireNonNull(begin);
            return this;
        }
        public Builder end(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }        public LicenseValidityDateFormat build() {
            return new LicenseValidityDateFormat(begin, end);
        }
    }
}

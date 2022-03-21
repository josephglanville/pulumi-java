// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LargeCustomDictionaryStatsResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2StoredInfoTypeStatsResponse {
    /**
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * 
     */
    private final GooglePrivacyDlpV2LargeCustomDictionaryStatsResponse largeCustomDictionary;

    @CustomType.Constructor
    private GooglePrivacyDlpV2StoredInfoTypeStatsResponse(@CustomType.Parameter("largeCustomDictionary") GooglePrivacyDlpV2LargeCustomDictionaryStatsResponse largeCustomDictionary) {
        this.largeCustomDictionary = largeCustomDictionary;
    }

    /**
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * 
    */
    public GooglePrivacyDlpV2LargeCustomDictionaryStatsResponse getLargeCustomDictionary() {
        return this.largeCustomDictionary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StoredInfoTypeStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2LargeCustomDictionaryStatsResponse largeCustomDictionary;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StoredInfoTypeStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.largeCustomDictionary = defaults.largeCustomDictionary;
        }

        public Builder largeCustomDictionary(GooglePrivacyDlpV2LargeCustomDictionaryStatsResponse largeCustomDictionary) {
            this.largeCustomDictionary = Objects.requireNonNull(largeCustomDictionary);
            return this;
        }        public GooglePrivacyDlpV2StoredInfoTypeStatsResponse build() {
            return new GooglePrivacyDlpV2StoredInfoTypeStatsResponse(largeCustomDictionary);
        }
    }
}

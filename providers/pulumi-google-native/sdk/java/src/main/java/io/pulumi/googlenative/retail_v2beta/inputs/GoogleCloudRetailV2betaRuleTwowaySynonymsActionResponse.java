// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Creates a set of terms that will be treated as synonyms of each other. Example: synonyms of "sneakers" and "shoes". * "sneakers" will use a synonym of "shoes". * "shoes" will use a synonym of "sneakers".
 * 
 */
public final class GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse Empty = new GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse();

    /**
     * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
     * 
     */
    @Import(name="synonyms", required=true)
      private final List<String> synonyms;

    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse(List<String> synonyms) {
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
    }

    private GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse() {
        this.synonyms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
        }

        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }        public GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse build() {
            return new GoogleCloudRetailV2betaRuleTwowaySynonymsActionResponse(synonyms);
        }
    }
}

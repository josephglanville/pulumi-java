// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Set search results crowding limits. Crowding is a situation in which multiple results from the same source or host "crowd out" other results, diminishing the quality of search for users. To foster better search quality and source diversity in search results, you can set a condition to reduce repetitive results by source.
 * 
 */
public final class SourceCrowdingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceCrowdingConfigResponse Empty = new SourceCrowdingConfigResponse();

    /**
     * Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
     * 
     */
    @Import(name="numResults", required=true)
      private final Integer numResults;

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
     * 
     */
    @Import(name="numSuggestions", required=true)
      private final Integer numSuggestions;

    public Integer getNumSuggestions() {
        return this.numSuggestions;
    }

    public SourceCrowdingConfigResponse(
        Integer numResults,
        Integer numSuggestions) {
        this.numResults = Objects.requireNonNull(numResults, "expected parameter 'numResults' to be non-null");
        this.numSuggestions = Objects.requireNonNull(numSuggestions, "expected parameter 'numSuggestions' to be non-null");
    }

    private SourceCrowdingConfigResponse() {
        this.numResults = null;
        this.numSuggestions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceCrowdingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numResults;
        private Integer numSuggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceCrowdingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numResults = defaults.numResults;
    	      this.numSuggestions = defaults.numSuggestions;
        }

        public Builder numResults(Integer numResults) {
            this.numResults = Objects.requireNonNull(numResults);
            return this;
        }
        public Builder numSuggestions(Integer numSuggestions) {
            this.numSuggestions = Objects.requireNonNull(numSuggestions);
            return this;
        }        public SourceCrowdingConfigResponse build() {
            return new SourceCrowdingConfigResponse(numResults, numSuggestions);
        }
    }
}

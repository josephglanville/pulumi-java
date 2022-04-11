// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the versioned name and the URL for one SearchParameter.
 * 
 */
public final class SearchParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final SearchParameterArgs Empty = new SearchParameterArgs();

    /**
     * The canonical url of the search parameter resource.
     * 
     */
    @Import(name="canonicalUrl")
      private final @Nullable Output<String> canonicalUrl;

    public Output<String> getCanonicalUrl() {
        return this.canonicalUrl == null ? Codegen.empty() : this.canonicalUrl;
    }

    /**
     * The versioned name of the search parameter resource. The format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/_history/{version-id} For fhir stores with disable_resource_versioning=true, the format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/
     * 
     */
    @Import(name="parameter")
      private final @Nullable Output<String> parameter;

    public Output<String> getParameter() {
        return this.parameter == null ? Codegen.empty() : this.parameter;
    }

    public SearchParameterArgs(
        @Nullable Output<String> canonicalUrl,
        @Nullable Output<String> parameter) {
        this.canonicalUrl = canonicalUrl;
        this.parameter = parameter;
    }

    private SearchParameterArgs() {
        this.canonicalUrl = Codegen.empty();
        this.parameter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> canonicalUrl;
        private @Nullable Output<String> parameter;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.parameter = defaults.parameter;
        }

        public Builder canonicalUrl(@Nullable Output<String> canonicalUrl) {
            this.canonicalUrl = canonicalUrl;
            return this;
        }
        public Builder canonicalUrl(@Nullable String canonicalUrl) {
            this.canonicalUrl = Codegen.ofNullable(canonicalUrl);
            return this;
        }
        public Builder parameter(@Nullable Output<String> parameter) {
            this.parameter = parameter;
            return this;
        }
        public Builder parameter(@Nullable String parameter) {
            this.parameter = Codegen.ofNullable(parameter);
            return this;
        }        public SearchParameterArgs build() {
            return new SearchParameterArgs(canonicalUrl, parameter);
        }
    }
}

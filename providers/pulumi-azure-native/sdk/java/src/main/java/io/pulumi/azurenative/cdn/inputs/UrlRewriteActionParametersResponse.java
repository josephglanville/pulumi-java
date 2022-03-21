// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the url rewrite action.
 * 
 */
public final class UrlRewriteActionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlRewriteActionParametersResponse Empty = new UrlRewriteActionParametersResponse();

    /**
     * Define the relative URL to which the above requests will be rewritten by.
     * 
     */
    @Import(name="destination", required=true)
      private final String destination;

    public String getDestination() {
        return this.destination;
    }

    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Whether to preserve unmatched path. Default value is true.
     * 
     */
    @Import(name="preserveUnmatchedPath")
      private final @Nullable Boolean preserveUnmatchedPath;

    public Optional<Boolean> getPreserveUnmatchedPath() {
        return this.preserveUnmatchedPath == null ? Optional.empty() : Optional.ofNullable(this.preserveUnmatchedPath);
    }

    /**
     * define a request URI pattern that identifies the type of requests that may be rewritten. If value is blank, all strings are matched.
     * 
     */
    @Import(name="sourcePattern", required=true)
      private final String sourcePattern;

    public String getSourcePattern() {
        return this.sourcePattern;
    }

    public UrlRewriteActionParametersResponse(
        String destination,
        String odataType,
        @Nullable Boolean preserveUnmatchedPath,
        String sourcePattern) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.preserveUnmatchedPath = preserveUnmatchedPath;
        this.sourcePattern = Objects.requireNonNull(sourcePattern, "expected parameter 'sourcePattern' to be non-null");
    }

    private UrlRewriteActionParametersResponse() {
        this.destination = null;
        this.odataType = null;
        this.preserveUnmatchedPath = null;
        this.sourcePattern = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRewriteActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private String odataType;
        private @Nullable Boolean preserveUnmatchedPath;
        private String sourcePattern;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRewriteActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.odataType = defaults.odataType;
    	      this.preserveUnmatchedPath = defaults.preserveUnmatchedPath;
    	      this.sourcePattern = defaults.sourcePattern;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder preserveUnmatchedPath(@Nullable Boolean preserveUnmatchedPath) {
            this.preserveUnmatchedPath = preserveUnmatchedPath;
            return this;
        }
        public Builder sourcePattern(String sourcePattern) {
            this.sourcePattern = Objects.requireNonNull(sourcePattern);
            return this;
        }        public UrlRewriteActionParametersResponse build() {
            return new UrlRewriteActionParametersResponse(destination, odataType, preserveUnmatchedPath, sourcePattern);
        }
    }
}

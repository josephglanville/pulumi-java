// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplicationArtifactResponse {
    private final String name;
    private final String type;
    private final String uri;

    @OutputCustomType.Constructor({"name","type","uri"})
    private ApplicationArtifactResponse(
        String name,
        String type,
        String uri) {
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.uri = Objects.requireNonNull(uri);
    }

    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public ApplicationArtifactResponse build() {
            return new ApplicationArtifactResponse(name, type, uri);
        }
    }
}

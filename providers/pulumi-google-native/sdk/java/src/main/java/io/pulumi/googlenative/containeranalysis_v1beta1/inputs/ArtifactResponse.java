// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Artifact describes a build product.
 * 
 */
public final class ArtifactResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArtifactResponse Empty = new ArtifactResponse();

    /**
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
     * 
     */
    @Import(name="checksum", required=true)
      private final String checksum;

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
     * 
     */
    @Import(name="names", required=true)
      private final List<String> names;

    public List<String> getNames() {
        return this.names;
    }

    public ArtifactResponse(
        String checksum,
        List<String> names) {
        this.checksum = Objects.requireNonNull(checksum, "expected parameter 'checksum' to be non-null");
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
    }

    private ArtifactResponse() {
        this.checksum = null;
        this.names = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checksum;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.names = defaults.names;
        }

        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public ArtifactResponse build() {
            return new ArtifactResponse(checksum, names);
        }
    }
}

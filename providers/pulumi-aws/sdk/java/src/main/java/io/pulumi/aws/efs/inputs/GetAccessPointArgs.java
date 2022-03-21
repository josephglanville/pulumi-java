// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccessPointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPointArgs Empty = new GetAccessPointArgs();

    /**
     * The ID that identifies the file system.
     * 
     */
    @Import(name="accessPointId", required=true)
      private final String accessPointId;

    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * Key-value mapping of resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetAccessPointArgs(
        String accessPointId,
        @Nullable Map<String,String> tags) {
        this.accessPointId = Objects.requireNonNull(accessPointId, "expected parameter 'accessPointId' to be non-null");
        this.tags = tags;
    }

    private GetAccessPointArgs() {
        this.accessPointId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPointId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointId = defaults.accessPointId;
    	      this.tags = defaults.tags;
        }

        public Builder accessPointId(String accessPointId) {
            this.accessPointId = Objects.requireNonNull(accessPointId);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetAccessPointArgs build() {
            return new GetAccessPointArgs(accessPointId, tags);
        }
    }
}

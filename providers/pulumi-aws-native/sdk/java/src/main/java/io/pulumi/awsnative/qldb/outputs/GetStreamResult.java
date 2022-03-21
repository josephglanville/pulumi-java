// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.qldb.outputs;

import io.pulumi.awsnative.qldb.outputs.StreamTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStreamResult {
    private final @Nullable String arn;
    private final @Nullable String id;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<StreamTag> tags;

    @CustomType.Constructor
    private GetStreamResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("tags") @Nullable List<StreamTag> tags) {
        this.arn = arn;
        this.id = id;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<StreamTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String id;
        private @Nullable List<StreamTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder tags(@Nullable List<StreamTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(StreamTag... tags) {
            return tags(List.of(tags));
        }        public GetStreamResult build() {
            return new GetStreamResult(arn, id, tags);
        }
    }
}

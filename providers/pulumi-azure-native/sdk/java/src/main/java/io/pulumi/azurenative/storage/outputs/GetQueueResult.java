// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetQueueResult {
    private final Integer approximateMessageCount;
    private final String id;
    private final @Nullable Map<String,String> metadata;
    private final String name;
    private final String type;

    @OutputCustomType.Constructor({"approximateMessageCount","id","metadata","name","type"})
    private GetQueueResult(
        Integer approximateMessageCount,
        String id,
        @Nullable Map<String,String> metadata,
        String name,
        String type) {
        this.approximateMessageCount = Objects.requireNonNull(approximateMessageCount);
        this.id = Objects.requireNonNull(id);
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    public Integer getApproximateMessageCount() {
        return this.approximateMessageCount;
    }
    public String getId() {
        return this.id;
    }
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer approximateMessageCount;
        private String id;
        private @Nullable Map<String,String> metadata;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approximateMessageCount = defaults.approximateMessageCount;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setApproximateMessageCount(Integer approximateMessageCount) {
            this.approximateMessageCount = Objects.requireNonNull(approximateMessageCount);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetQueueResult build() {
            return new GetQueueResult(approximateMessageCount, id, metadata, name, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineRemoveAttributes {
    private final List<String> attributes;
    private final String name;
    private final @Nullable String next;

    @CustomType.Constructor
    private PipelineRemoveAttributes(
        @CustomType.Parameter("attributes") List<String> attributes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("next") @Nullable String next) {
        this.attributes = attributes;
        this.name = name;
        this.next = next;
    }

    public List<String> getAttributes() {
        return this.attributes;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNext() {
        return Optional.ofNullable(this.next);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRemoveAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attributes;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRemoveAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder attributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }        public PipelineRemoveAttributes build() {
            return new PipelineRemoveAttributes(attributes, name, next);
        }
    }
}

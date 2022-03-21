// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyGroupConfig extends io.pulumi.resources.InvokeArgs {

    public static final KeyGroupConfig Empty = new KeyGroupConfig();

    @Import(name="comment")
      private final @Nullable String comment;

    public Optional<String> getComment() {
        return this.comment == null ? Optional.empty() : Optional.ofNullable(this.comment);
    }

    @Import(name="items", required=true)
      private final List<String> items;

    public List<String> getItems() {
        return this.items;
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public KeyGroupConfig(
        @Nullable String comment,
        List<String> items,
        String name) {
        this.comment = comment;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private KeyGroupConfig() {
        this.comment = null;
        this.items = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyGroupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private List<String> items;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public KeyGroupConfig build() {
            return new KeyGroupConfig(comment, items, name);
        }
    }
}

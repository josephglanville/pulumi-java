// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateColumnGroupColumnSchema {
    /**
     * <p>The name of the column group's column schema.</p>
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private TemplateColumnGroupColumnSchema(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * <p>The name of the column group's column schema.</p>
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateColumnGroupColumnSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateColumnGroupColumnSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public TemplateColumnGroupColumnSchema build() {
            return new TemplateColumnGroupColumnSchema(name);
        }
    }
}

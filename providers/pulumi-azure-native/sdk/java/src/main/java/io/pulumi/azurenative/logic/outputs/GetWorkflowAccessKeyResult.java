// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkflowAccessKeyResult {
    private final @Nullable String id;
    private final String name;
    private final @Nullable String notAfter;
    private final @Nullable String notBefore;
    private final String type;

    @OutputCustomType.Constructor({"id","name","notAfter","notBefore","type"})
    private GetWorkflowAccessKeyResult(
        @Nullable String id,
        String name,
        @Nullable String notAfter,
        @Nullable String notBefore,
        String type) {
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.notAfter = notAfter;
        this.notBefore = notBefore;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNotAfter() {
        return Optional.ofNullable(this.notAfter);
    }
    public Optional<String> getNotBefore() {
        return Optional.ofNullable(this.notBefore);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowAccessKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String name;
        private @Nullable String notAfter;
        private @Nullable String notBefore;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowAccessKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotAfter(@Nullable String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        public Builder setNotBefore(@Nullable String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWorkflowAccessKeyResult build() {
            return new GetWorkflowAccessKeyResult(id, name, notAfter, notBefore, type);
        }
    }
}

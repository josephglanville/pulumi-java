// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetBucketLifecycleRuleCondition extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketLifecycleRuleCondition Empty = new GetBucketLifecycleRuleCondition();

    @InputImport(name="age", required=true)
      private final Integer age;

    public Integer getAge() {
        return this.age;
    }

    @InputImport(name="createdBefore", required=true)
      private final String createdBefore;

    public String getCreatedBefore() {
        return this.createdBefore;
    }

    @InputImport(name="customTimeBefore", required=true)
      private final String customTimeBefore;

    public String getCustomTimeBefore() {
        return this.customTimeBefore;
    }

    @InputImport(name="daysSinceCustomTime", required=true)
      private final Integer daysSinceCustomTime;

    public Integer getDaysSinceCustomTime() {
        return this.daysSinceCustomTime;
    }

    @InputImport(name="daysSinceNoncurrentTime", required=true)
      private final Integer daysSinceNoncurrentTime;

    public Integer getDaysSinceNoncurrentTime() {
        return this.daysSinceNoncurrentTime;
    }

    @InputImport(name="matchesStorageClasses", required=true)
      private final List<String> matchesStorageClasses;

    public List<String> getMatchesStorageClasses() {
        return this.matchesStorageClasses;
    }

    @InputImport(name="noncurrentTimeBefore", required=true)
      private final String noncurrentTimeBefore;

    public String getNoncurrentTimeBefore() {
        return this.noncurrentTimeBefore;
    }

    @InputImport(name="numNewerVersions", required=true)
      private final Integer numNewerVersions;

    public Integer getNumNewerVersions() {
        return this.numNewerVersions;
    }

    @InputImport(name="withState", required=true)
      private final String withState;

    public String getWithState() {
        return this.withState;
    }

    public GetBucketLifecycleRuleCondition(
        Integer age,
        String createdBefore,
        String customTimeBefore,
        Integer daysSinceCustomTime,
        Integer daysSinceNoncurrentTime,
        List<String> matchesStorageClasses,
        String noncurrentTimeBefore,
        Integer numNewerVersions,
        String withState) {
        this.age = Objects.requireNonNull(age, "expected parameter 'age' to be non-null");
        this.createdBefore = Objects.requireNonNull(createdBefore, "expected parameter 'createdBefore' to be non-null");
        this.customTimeBefore = Objects.requireNonNull(customTimeBefore, "expected parameter 'customTimeBefore' to be non-null");
        this.daysSinceCustomTime = Objects.requireNonNull(daysSinceCustomTime, "expected parameter 'daysSinceCustomTime' to be non-null");
        this.daysSinceNoncurrentTime = Objects.requireNonNull(daysSinceNoncurrentTime, "expected parameter 'daysSinceNoncurrentTime' to be non-null");
        this.matchesStorageClasses = Objects.requireNonNull(matchesStorageClasses, "expected parameter 'matchesStorageClasses' to be non-null");
        this.noncurrentTimeBefore = Objects.requireNonNull(noncurrentTimeBefore, "expected parameter 'noncurrentTimeBefore' to be non-null");
        this.numNewerVersions = Objects.requireNonNull(numNewerVersions, "expected parameter 'numNewerVersions' to be non-null");
        this.withState = Objects.requireNonNull(withState, "expected parameter 'withState' to be non-null");
    }

    private GetBucketLifecycleRuleCondition() {
        this.age = null;
        this.createdBefore = null;
        this.customTimeBefore = null;
        this.daysSinceCustomTime = null;
        this.daysSinceNoncurrentTime = null;
        this.matchesStorageClasses = List.of();
        this.noncurrentTimeBefore = null;
        this.numNewerVersions = null;
        this.withState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketLifecycleRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer age;
        private String createdBefore;
        private String customTimeBefore;
        private Integer daysSinceCustomTime;
        private Integer daysSinceNoncurrentTime;
        private List<String> matchesStorageClasses;
        private String noncurrentTimeBefore;
        private Integer numNewerVersions;
        private String withState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketLifecycleRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.age = defaults.age;
    	      this.createdBefore = defaults.createdBefore;
    	      this.customTimeBefore = defaults.customTimeBefore;
    	      this.daysSinceCustomTime = defaults.daysSinceCustomTime;
    	      this.daysSinceNoncurrentTime = defaults.daysSinceNoncurrentTime;
    	      this.matchesStorageClasses = defaults.matchesStorageClasses;
    	      this.noncurrentTimeBefore = defaults.noncurrentTimeBefore;
    	      this.numNewerVersions = defaults.numNewerVersions;
    	      this.withState = defaults.withState;
        }

        public Builder setAge(Integer age) {
            this.age = Objects.requireNonNull(age);
            return this;
        }

        public Builder setCreatedBefore(String createdBefore) {
            this.createdBefore = Objects.requireNonNull(createdBefore);
            return this;
        }

        public Builder setCustomTimeBefore(String customTimeBefore) {
            this.customTimeBefore = Objects.requireNonNull(customTimeBefore);
            return this;
        }

        public Builder setDaysSinceCustomTime(Integer daysSinceCustomTime) {
            this.daysSinceCustomTime = Objects.requireNonNull(daysSinceCustomTime);
            return this;
        }

        public Builder setDaysSinceNoncurrentTime(Integer daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = Objects.requireNonNull(daysSinceNoncurrentTime);
            return this;
        }

        public Builder setMatchesStorageClasses(List<String> matchesStorageClasses) {
            this.matchesStorageClasses = Objects.requireNonNull(matchesStorageClasses);
            return this;
        }

        public Builder setNoncurrentTimeBefore(String noncurrentTimeBefore) {
            this.noncurrentTimeBefore = Objects.requireNonNull(noncurrentTimeBefore);
            return this;
        }

        public Builder setNumNewerVersions(Integer numNewerVersions) {
            this.numNewerVersions = Objects.requireNonNull(numNewerVersions);
            return this;
        }

        public Builder setWithState(String withState) {
            this.withState = Objects.requireNonNull(withState);
            return this;
        }
        public GetBucketLifecycleRuleCondition build() {
            return new GetBucketLifecycleRuleCondition(age, createdBefore, customTimeBefore, daysSinceCustomTime, daysSinceNoncurrentTime, matchesStorageClasses, noncurrentTimeBefore, numNewerVersions, withState);
        }
    }
}

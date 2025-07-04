
# 📚 Jetpack Compose Book List UI

یک پروژه ساده اما حرفه‌ای با استفاده از **Jetpack Compose** برای نمایش دسته‌بندی کتاب‌ها به همراه تصاویر. این پروژه با تمرکز بر روی طراحی زیبا، استفاده بهینه از کامپوزیت‌ها و چیدمان تو در تو (Nested Scrolling with LazyColumn & LazyRow) پیاده‌سازی شده است.

---

## 🖼️ دموی رابط کاربری

| لیست کتاب‌ها با دسته‌بندی‌های مختلف |
|------------------------------------|
| ![demo](screenshots/demo.png)     |
> *در صورتی که تصویر آماده نیست، لطفاً یک اسکرین‌شات از اپ بگیرید و در مسیر `screenshots/` قرار دهید.*

---

## 📦 ویژگی‌های پروژه

✅ استفاده از `LazyColumn` برای نمایش دسته‌بندی‌ها  
✅ نمایش لیستی از تصاویر کتاب‌ها در `LazyRow`  
✅ ساختار داده‌ای تمیز و قابل توسعه با مدل‌های `ParentDataClass` و `ChildDataClass`  
✅ طراحی زیبا و شخصی‌سازی شده با استفاده از `Card`, `Box`, `Image`, `Text` و رنگ‌های دل‌نشین  
✅ استفاده از `Modifier`های ترکیبی برای طراحی UI رسپانسیو و مرتب

---

## 📂 ساختار پروژه

```
📁 MainActivity.kt
├── 🔹 loadingData(): لود دیتاهای تستی
├── 🔹 PreviewBook(): نقطه شروع کامپوز UI
├── 🔹 CreateColumUi(): ساخت یک دسته‌بندی
└── 🔹 CreateRowImage(): ساخت تصویر کتاب
```

---

## 📐 مدل‌های داده

```kotlin
data class ParentDataClass(
    val title: String,
    val childDataList: List<ChildDataClass>
)

data class ChildDataClass(
    val image: Int // resource ID of image
)
```

---

## 🛠️ تکنولوژی‌های استفاده شده

| تکنولوژی | توضیح |
|----------|--------|
| 🧱 Jetpack Compose | طراحی UI مدرن و دکلره |
| 🎨 Material Design 3 | استفاده از رنگ‌ها و مؤلفه‌های جدید |
| 🖼️ Image Resources | نمایش تصاویر با resource ID |
| 🧪 Fake Data | لود داده‌های تستی بدون دیتابیس |
| 📐 Modifier API | طراحی رسپانسیو و مرتب |

---

## 🚀 نحوه اجرا

1. پروژه را با Android Studio (Giraffe یا بالاتر) باز کنید.
2. Emulator یا گوشی واقعی را انتخاب کنید.
3. Run کنید یا از `Preview` در Compose استفاده کنید.

---

## 📈 اهداف این پروژه

- آشنایی با لیست‌های تو در تو (Nested Lazy Lists)
- تمرین روی ترکیب Layoutها در Jetpack Compose
- آماده‌سازی پروژه برای نمایش در رزومه گیت‌هاب

---

## 🙋‍♂️ توسعه‌دهنده

علیرضا حلوای فرد  
[GitHub: android24h](https://github.com/android24h)  
📧 ahf.programmer@gmail.com  
📱 09360896001  
📍 دزفول، ایران

---

## 📝 مجوز

این پروژه تحت مجوز [MIT License](LICENSE) ارائه شده است.
